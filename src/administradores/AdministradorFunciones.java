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
		insertar.crearEstructuraParaInsertar(DAO.FUNCION, "idfuncion, idObra, fechaFuncion, inicioFuncion, finalFuncion");
		insertar.insertarInt(1, this.funcion.getIdFuncion());
		insertar.crearEstructuraParaInsertar(DAO.FUNCION,"idObra");
		insertar.crearEstructuraParaInsertar(DAO.FUNCION, "fechaFuncion");
		insertar.insertarTime(5, this.funcion.getInicioFuncion());
		insertar.insertarTime(6, this.funcion.getFinalFuncion());
		int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta obra?", "Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (reply == JOptionPane.YES_OPTION) {
            insertar.confirmar();
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
	}
	
	private void crearEntidadFuncion() throws SQLException {
		this.obra = new Obra();
		this.obra.setNombre(panel.getTxtFieldNombreObra().getText());
		this.obra.setPrecio(Double.parseDouble(panel.getTxtFieldPrecio().getText()));
		this.obra.setDuracion(calcularDuracion());
		this.obra.setDescripcion(this.panel.getTextAreaDescripcion().getText());
		this.obra.setEstado(AdministradorObras.ESTADO_ACTIVO);
	}
	
	private Time calcularDuracion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		long milisecDuracion = getMilisegundos(horas, minutos);
		return new Time(milisecDuracion);
	}

	private long getMilisegundos(int hor, int min) {
		return (hor * 3600000) + (min * 60000);
	}
}
