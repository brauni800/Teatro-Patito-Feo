package administradores;

import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
import bd.DAO;
import entidades.Obra;
import paneles.PanelFactory;

/**
 * 
 * @author brauni800
 *
 */
public class AdministradorObras {

	public static final String ESTADO_ACTIVO = "ESTADO_ACTIVO";
	public static final String ESTADO_CANCELADO = "\"ESTADO_CANCELADO\"";

	private PanelFactory panel;
	private Obra obra;
	private boolean validarDatosCompletos;

	/**
	 * Constructor del administrador de Obras.
	 * 
	 * @param panel
	 *            Interfaz en el que se va a ejecutar el administrador
	 */
	public AdministradorObras(PanelFactory panel) {
		super();
		this.panel = panel;
		this.validarDatosCompletos = true;
	}

	/**
	 * Método para inicializar el proceso de insertar Obras.
	 * 
	 * @throws SQLException
	 *             Error por falta de datos.
	 */
	public void crearObra() throws SQLException {
		crearEntidadObra();
		insertarObraBD();
	}

	/**
	 * Metodo para iniciliazar el proceso de cancelar Obra.
	 * 
	 * @throws SQLException
	 *             Error por falta de datos.
	 */
	public void cancelarObra() throws SQLException {
		crearEntidadObraParaActualizar();
		cancelarObraBD();
	}

	/**
	 * Metodo para leer los datos que serán insertados en la base de datos.
	 * 
	 * @throws SQLException
	 *             Error por falta de datos.
	 */
	private void crearEntidadObra() throws SQLException {
		try {
			this.obra = new Obra();
			this.obra.setIdRepresentante(buscarIdRepresentante());
			this.obra.setNombre(panel.getTxtFieldNombreObra().getText());
			this.obra.setPrecio(Double.parseDouble(panel.getTxtFieldPrecio().getText()));
			this.obra.setDuracion(calcularDuracion());
			this.obra.setDescripcion(this.panel.getTextAreaDescripcion().getText());
			this.obra.setEstado(AdministradorObras.ESTADO_ACTIVO);
		} catch (NullPointerException | NumberFormatException e) {
			this.validarDatosCompletos = false;
			JOptionPane.showMessageDialog(null, "Faltan datos");
		}
	}

	/**
	 * Método para leer datos de la obra para actualizarse.
	 * 
	 * @throws SQLException
	 *             Error por falta de datos.
	 */
	private void crearEntidadObraParaActualizar() throws SQLException {
		try {
			this.obra = new Obra();
			this.obra.setIdRepresentante(buscarIdRepresentante());
			this.obra.setNombre(panel.getTxtFieldNombreObra().getText());
			this.obra.setPrecio(Double.parseDouble(panel.getTxtFieldPrecio().getText()));
			this.obra.setDuracion(calcularDuracion());
			this.obra.setDescripcion(this.panel.getTextAreaDescripcion().getText());
			this.obra.setEstado(AdministradorObras.ESTADO_ACTIVO);
		} catch (NullPointerException | NumberFormatException e) {
		}
	}

	/**
	 * Método para cancelar obra y todas sus funciones.
	 * 
	 * @throws SQLException
	 *             Error por falta de datos.
	 */
	private void cancelarObraBD() throws SQLException {

		DAO cancelar = new DAO();

		int fila = this.panel.getTable().getSelectedRow();
		Object id = this.panel.getTable().getValueAt(fila, 0);

		this.obra.setEstado(ESTADO_CANCELADO);

		cancelar.estruturaParaActualizarCondicion(DAO.OBRA, "estado", this.obra.getEstado(), "idObra", id);

		int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar esta obra?", "Cancelar obra",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (reply == JOptionPane.YES_OPTION) {
			cancelar.confirmar();
			AdministradorFunciones cancelarFunciones = new AdministradorFunciones(panel);
			cancelarFunciones.cancelarFuncionesObras(id);
			JOptionPane.showMessageDialog(null, "Se ha cancelado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Método para insertar una nueva función en la base de datos.
	 * 
	 * @throws SQLException
	 */
	private void insertarObraBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.OBRA,
				"idRepresentante, nombreObra, precioObra, duracionObra, descripcionObra, estado");
		insertar.insertarInt(1, this.obra.getIdRepresentante());
		insertar.insertarString(2, this.obra.getNombre());
		insertar.insertarDouble(3, this.obra.getPrecio());
		insertar.insertarTime(4, this.obra.getDuracion());
		insertar.insertarString(5, this.obra.getDescripcion());
		insertar.insertarString(6, this.obra.getEstado());

		if (this.validarDatosCompletos == true) {
			int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta obra?",
					"Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (reply == JOptionPane.YES_OPTION) {
				insertar.confirmar();
				JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	/**
	 * Método para obtener el representante del ComboBox
	 * 
	 * @return idRepresentante Identificador del representante en la base de datos.
	 * @throws SQLException
	 *             Error por falta de datos.
	 */
	private int buscarIdRepresentante() throws SQLException {
		int idRepresentante = -1;
		String nombreCompletoRepresentante = this.panel.getCmBoxRepresentantes().getSelectedItem().toString();
		String[] nombreRepresentante = nombreCompletoRepresentante.split(" ");
		String what = "\"" + nombreRepresentante[0] + "\"";
		Object[][] buscar = new DAO().buscarConFiltro("idRepresentante, nombre, apellido", DAO.REPRESENTANTE, "nombre",
				what);
		for (int i = 0; i < buscar.length; i++) {
			String nombreCompletoEncontrado = buscar[i][1].toString() + " " + buscar[i][2].toString();
			if (nombreCompletoRepresentante.equals(nombreCompletoEncontrado)) {
				idRepresentante = (Integer) buscar[i][0];
			}
		}
		return idRepresentante;
	}

	/**
	 * Método para obtener el tiempo de los combo box en tipo Time para inserción en
	 * base de datos.
	 * 
	 * @return Time Valor compatible con la base de datos.
	 */
	private Time calcularDuracion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		return new Time(((horas * 3600000) + (minutos * 60000)) - 64800000);
	}
}
