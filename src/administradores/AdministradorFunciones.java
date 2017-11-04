package administradores;

import java.sql.SQLException;
import java.sql.Time;

import javax.swing.JOptionPane;

import bd.DAO;
import entidades.Obra;
import paneles.PanelFactory;

public class AdministradorFunciones {

	public static final String ESTADO_ACTIVO = "ESTADO_ACTIVO";
	public static final String ESTADO_CANCELADO = "ESTADO_CANCELADO";

	private PanelFactory panel;
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
		insertar.crearEstructuraParaInsertar(DAO.OBRA, "idRepresentante, nombreObra, precioObra, duracionObra, descripcionObra, estado");
		insertar.insertarInt(1, this.obra.getIdRepresentante());
		insertar.insertarString(2, this.obra.getNombre());
		insertar.insertarDouble(3, this.obra.getPrecio());
		insertar.insertarTime(4, this.obra.getDuracion());
		insertar.insertarString(5, this.obra.getDescripcion());
		insertar.insertarString(6, this.obra.getEstado());
		int reply = JOptionPane.showConfirmDialog(null, "�Est� seguro que desea registrar esta obra?", "Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
