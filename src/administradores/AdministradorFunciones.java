package administradores;

import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import bd.DAO;
import entidades.Funcion;
import paneles.PanelFactory;
import tablas.TablaFunciones;

public class AdministradorFunciones {

	public static final String ESTADO_ACTIVO = "ACTIVO";
	public static final String ESTADO_CANCELADO = "\"CANCELADO\"";

	private PanelFactory panel;
	private Funcion funcion;
	private boolean validarDatosCompletos;

	public AdministradorFunciones(PanelFactory panel) {
		super();
		this.panel = panel;
		this.validarDatosCompletos = true;
	}

	/**
	 * Metodo desarrollado para inicializar el proceso de insertar una funcion en la
	 * base de datos.
	 * 
	 * @throws SQLException
	 */
	public void crearFuncion() throws SQLException {
		crearEntidadFuncion();
		insertarFuncionBD();
	}

	/**
	 * Metodo desarrollado para inicializar el proceso de editar una funcion en la
	 * base de datos.
	 * 
	 * @throws SQLException
	 */
	public void editarFuncion() throws SQLException {
		crearEntidadActualizar();
		editarFuncionBD();
	}

	/**
	 * Metodo desarrollado para inicializar el proceso de cancelar una funcion en la
	 * base de datos.
	 * 
	 * @throws SQLException
	 */
	public void cancelarFuncion() throws SQLException {
		crearEntidadActualizar();
		cancelarFuncionBD();
	}

	/**
	 * Metodo para leer los datos que serán insertados en la base de datos.
	 * 
	 * @throws SQLException
	 */
	private void crearEntidadFuncion() throws SQLException {
		try {
			this.funcion = new Funcion();
			this.funcion.setIdObra(obtenerIDObra());
			this.funcion.setInicioFuncion(inicioFuncion());
			this.funcion.setFinalFuncion(finalFuncion());
			this.funcion.setFechaFuncion(panel.getCalendario().getDate().getTime());
			this.funcion.setDisponiblidadFuncion(ESTADO_ACTIVO);
		} catch (NullPointerException e) {
			this.validarDatosCompletos = false;
			JOptionPane.showMessageDialog(null, "Falta algún dato");
		}
	}

	private void crearEntidadActualizar() throws SQLException {
		try {
			this.funcion = new Funcion();
			this.funcion.setIdObra(obtenerIDObra());
			this.funcion.setInicioFuncion(inicioFuncion());
			this.funcion.setFinalFuncion(finalFuncion());
			this.funcion.setFechaFuncion(panel.getCalendario().getDate().getTime());
			this.funcion.setDisponiblidadFuncion(ESTADO_ACTIVO);
		} catch (NullPointerException e) {
			e.getMessage();
		}
	}

	/**
	 * Método para modificar los datos de una función de tal manera que su
	 * disponibilidad sea cancelado y sus horarios removidos.
	 * 
	 * @throws SQLException
	 */
	private void cancelarFuncionBD() throws SQLException {

		DAO cancelar = new DAO();

		int fila = this.panel.getTableFunciones().getSelectedRow();
		Object id = this.panel.getTableFunciones().getValueAt(fila, 0);

		this.funcion.setDisponiblidadFuncion(ESTADO_CANCELADO);

		cancelar.estruturaParaActualizarCondicion(DAO.FUNCION, "disponibilidadFuncion",
				this.funcion.getDisponiblidadFuncion(), "idFuncion", id);

		int reply = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea cancelar la funcion?",
				"Actualizar Funcion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (reply == JOptionPane.YES_OPTION) {
			cancelar.confirmar();
			JOptionPane.showMessageDialog(null, "Ha cancelado la Funcion", "", JOptionPane.INFORMATION_MESSAGE);
		}

		actualizarTabla();
	}

	/**
	 * Metodo para modificar los datos de una función
	 * 
	 * @throws SQLException
	 */
	private void editarFuncionBD() throws SQLException {

		DAO editar = new DAO();

		int fila = this.panel.getTableFunciones().getSelectedRow();
		int columna = this.panel.getTableFunciones().getSelectedColumn();

		Object id = this.panel.getTableFunciones().getValueAt(fila, 0);
		String columnName = this.panel.getTableFunciones().getColumnName(columna);
		
		if(columnName.equals("Fecha")) {
			this.funcion.setFechaFuncion(panel.getCalendario().getDate().getTime());
			editar.estruturaParaActualizarCondicion(DAO.FUNCION, columnName + "funcion",
					this.funcion.getFechaFuncion(), "idFuncion", id);
		}
		
		if(columnName.equals("Inicio")) {
			this.funcion.setInicioFuncion(inicioFuncion());
			editar.estruturaParaActualizarCondicion(DAO.FUNCION, columnName + "funcion",
					this.funcion.getInicioFuncion(), "idFuncion", id);
		}
		

			if (validarHorarios() == true) {
				int reply = JOptionPane.showConfirmDialog(null, "Esta seguro de que desea actualizar la funcion?",
						"Actualizar Funcion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (reply == JOptionPane.YES_OPTION) {
					editar.confirmar();
					JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Ya existe una funci�n a esa hora");
			
		}
		actualizarTabla();
	}

	/**
	 * Metodo para crear una funcion
	 * 
	 * @throws SQLException
	 */
	private void insertarFuncionBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.FUNCION,
				"idfuncion, idObra, fechaFuncion, inicioFuncion, finalFuncion, disponibilidadFuncion");
		insertar.insertarInt(1, this.funcion.getIdFuncion());
		insertar.insertarInt(2, this.funcion.getIdObra());
		insertar.insertarDate(3, this.funcion.getFechaFuncion());
		insertar.insertarTime(4, inicioFuncion());
		insertar.insertarTime(5, finalFuncion());
		insertar.insertarString(6, this.funcion.getDisponiblidadFuncion());

		if (this.validarDatosCompletos == true) {
			if (validarHorarios() == true) {
				int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta obra?",
						"Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (reply == JOptionPane.YES_OPTION) {
					insertar.confirmar();
					JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Ya existe una función a esa hora");
			}
		}

		actualizarTabla();
	}

	/**
	 * Valida que los horarios de las funciones no sean las mismas.
	 * 
	 * @return La validación cierta o false sobre la colision de horarios
	 * @throws SQLException
	 */
	private boolean validarHorarios() throws SQLException {
		Object[][] buscar = new DAO().buscar("fechaFuncion,inicioFuncion,finalFuncion", DAO.FUNCION);
		java.sql.Date date = new java.sql.Date(this.funcion.getFechaFuncion());
		for (int i = 0; i < buscar.length; i++) {

			String tiempo[] = buscar[i][1].toString().split(":");
			int horaInicio = Integer.parseInt(tiempo[0]);
			int minutosInicio = Integer.parseInt(tiempo[1]);
			Time horario = new Time(((horaInicio * 3600000) + (minutosInicio * 60000)) - 64800000);

			if ((date.toString()).equals(buscar[i][0].toString())
					&& this.funcion.getInicioFuncion().getTime() <= horario.getTime()
					&& this.funcion.getFinalFuncion().getTime() >= horario.getTime()
					&& this.funcion.getDisponiblidadFuncion().equals(ESTADO_CANCELADO)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Método para transformar los enteros en milisegundos para la base de datos.
	 * 
	 * @return El valor en tipo Tiempo para insertarse en la base de datos
	 */
	private Time inicioFuncion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();

		return new Time(((horas * 3600000) + (minutos * 60000)) - 64800000);
	}

	/**
	 * Método para obtener el el horario final de una función.
	 * 
	 * @return El valor en tipo Tiempo para insertarse en la base de datos
	 * @throws SQLException
	 */
	private Time finalFuncion() throws SQLException {

		Object[][] obra = new DAO().buscarConFiltro("duracionObra", DAO.OBRA, "idObra", obtenerIDObra());
		long milisegundos = 0;
		for (int i = 0; i < obra.length; i++) {
			String tiempo[] = obra[0][0].toString().split(":");
			int horaInicio = Integer.parseInt(tiempo[0]);
			int minutosInicio = Integer.parseInt(tiempo[1]);
			milisegundos = (((horaInicio * 3600000) + (minutosInicio * 60000)));
		}
		long finalFuncion = inicioFuncion().getTime() + milisegundos;
		return new Time(finalFuncion);
	}

	/**
	 * Obtener del ComboBox de Obras el ID para la función
	 * 
	 * @return el valor entero de el id de la obra
	 */
	public int obtenerIDObra() {
		String item = panel.getCmBoxSeleccionarObra().getSelectedItem().toString();
		String[] idObra = item.split(" ");
		return Integer.parseInt(idObra[0]);
	}

	/**
	 * Método para actualizar la tabla cuando existan cambios.
	 */
	public void actualizarTabla() {
		JTable table = new TablaFunciones(obtenerIDObra());
		this.panel.setTableFunciones(table);
		table.setVisible(true);
		this.panel.getScrollPane().setViewportView(table);
	}

}
