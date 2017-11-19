package administradores;

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
