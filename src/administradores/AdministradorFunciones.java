package administradores;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
import bd.DAO;
import entidades.Funcion;
import entidades.Obra;
import paneles.PanelFactory;

public class AdministradorFunciones {

	public static final String ESTADO_ACTIVO = "ACTIVO";
	public static final String ESTADO_CANCELADO = "CANCELADO";

	private PanelFactory panel;
	private Funcion funcion;

	public AdministradorFunciones(PanelFactory panel) {
		super();
		this.panel = panel;
	}

	public void crearFuncion() throws SQLException {
		crearEntidadFuncion();
		insertarFuncionBD();
	}
	
	public void editarFuncion() throws SQLException{
		
	}
	
	private void editarFuncionBD() throws SQLException{
		DAO editar = new DAO();
		editar.crearEstructuraParaActualizar(DAO.FUNCION, "disponibilidadFuncion", "ACTIVO");
		//editar.insertarInt(1, this.funcion.getIdFuncion());
		//editar.insertarInt(2, this.funcion.getIdObra());
		//editar.insertarDate(3, this.funcion.getFechaFuncion());
		//editar.insertarTime(4, this.funcion.getInicioFuncion());
		//editar.insertarTime(5, this.funcion.getFinalFuncion());
		editar.insertarString(1, this.funcion.getDisponiblidadFuncion());
		int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea editar esta funcion?", "Actualizar Funcion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (reply == JOptionPane.YES_OPTION) {
            editar.confirmar();
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
		
	}
	
	private void insertarFuncionBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.FUNCION, "idfuncion, idObra, fechaFuncion, inicioFuncion, finalFuncion, disponibilidadFuncion");
		insertar.insertarInt(1, this.funcion.getIdFuncion());
		insertar.insertarInt(2, this.funcion.getIdObra());
		insertar.insertarDate(3, this.funcion.getFechaFuncion());
		insertar.insertarTime(4, this.funcion.getInicioFuncion());
		insertar.insertarTime(5, this.funcion.getFinalFuncion());
		
		Object[][] buscar = new DAO().buscar("fechaFuncion,inicioFuncion,finalFuncion",DAO.FUNCION);
		boolean deteced = false;
		java.sql.Date date = new java.sql.Date(this.funcion.getFechaFuncion());
		for(int i = 0; i<buscar.length; i++) {		
			System.out.println(buscar[i][0]);
			if((buscar[i][0]).equals(date) &&
					buscar[i][1].equals(this.funcion.getInicioFuncion())){
				deteced = true;
			}else {
				deteced = false;
			}
		}
		
		if(deteced = false) {
			insertar.insertarString(6, this.funcion.getDisponiblidadFuncion());
			int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta obra?", "Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	        if (reply == JOptionPane.YES_OPTION) {
	            insertar.confirmar();
	            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
	        }
		} else {
			JOptionPane.showMessageDialog(null, "Ya existe una función a esa hora");
		}
		
		
	}
	
	private void crearEntidadFuncion() throws SQLException {
		this.funcion = new Funcion();
		this.funcion.setIdObra(panel.getCmBoxSeleccionarObra().getComponentCount());
		this.funcion.setInicioFuncion(inicioFuncion());
		this.funcion.setFinalFuncion(finalFuncion());
		this.funcion.setFechaFuncion(panel.getCalendario().getDate().getTime());
		this.funcion.setDisponiblidadFuncion(ESTADO_ACTIVO);
	}
	
	@SuppressWarnings("deprecation")
	private Time inicioFuncion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		return new Time(horas, minutos, 0);
	}
	
	@SuppressWarnings("deprecation")
	private Time finalFuncion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		return new Time(horas, minutos, 0);
	}
}
