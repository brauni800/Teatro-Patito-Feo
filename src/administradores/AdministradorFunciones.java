package administradores;

import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
import bd.DAO;
import entidades.Funcion;
import entidades.Obra;
import paneles.PanelFactory;

public class AdministradorFunciones {

	public static final String ESTADO_ACTIVO = "ESTADO_ACTIVO";
	public static final String ESTADO_CANCELADO = "ESTADO_CANCELADO";

	private PanelFactory panel;
	private Funcion funcion;
	private Obra obra;

	public AdministradorFunciones(PanelFactory panel) {
		super();
		this.panel = panel;
	}

	public void crearFuncion() throws SQLException {
		crearEntidadFuncion();
		insertarFuncionBD();
	}
	
	private void insertarFuncionBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.FUNCION, "idfuncion, idObra, fechaFuncion, inicioFuncion, finalFuncion, disponibilidadFuncion");
		insertar.insertarInt(1, this.funcion.getIdFuncion());
		insertar.insertarInt(2, this.funcion.getIdObra());
		insertar.insertarDate(3, this.funcion.getFechaFuncion());
		insertar.insertarTime(4, this.funcion.getInicioFuncion());
		insertar.insertarTime(5, this.funcion.getFinalFuncion());
		insertar.insertarString(6, this.funcion.getDisponiblidadFuncion());
		int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta obra?", "Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (reply == JOptionPane.YES_OPTION) {
            insertar.confirmar();
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
	}
	
	private void crearEntidadFuncion() throws SQLException {
		System.out.println(panel.getCalendario().getDate().getTime());
		this.funcion = new Funcion();
		this.funcion.setIdObra(panel.getCmBoxSeleccionarObra().getComponentCount());
		this.funcion.setInicioFuncion(inicioFuncion());
		this.funcion.setFinalFuncion(finalFuncion());
		this.funcion.setFechaFuncion(panel.getCalendario().getDate());
		this.funcion.setDisponiblidadFuncion("DISPONIBLE");
	}
	
	private Time inicioFuncion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		long milisecDuracion = getMilisegundos(horas, minutos);
		return new Time(milisecDuracion);
	}
	
	private Time finalFuncion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		long milisecDuracion = getMilisegundos(horas, minutos);
		return new Time(milisecDuracion);
	}

	private long getMilisegundos(int hor, int min) {
		return (hor * 3600000) + (min * 60000);
	}
}
