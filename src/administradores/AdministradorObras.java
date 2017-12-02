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
	public static final String ESTADO_CANCELADO = "ESTADO_CANCELADO";

	private PanelFactory panel;
	private Obra obra;

	public AdministradorObras(PanelFactory panel) {
		super();
		this.panel = panel;
	}

	public void crearObra() throws SQLException {
		crearEntidadObra();
		insertarObraBD();
	}

	// ****************************************************************************************
	// ****************************************************************************************
	// **************************Recursos para los metodos publicos****************************
	// ****************************************************************************************
	// ***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***

	private void insertarObraBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.OBRA, "idRepresentante, nombreObra, precioObra, duracionObra, descripcionObra, estado");
		insertar.insertarInt(1, this.obra.getIdRepresentante());
		insertar.insertarString(2, this.obra.getNombre());
		insertar.insertarDouble(3, this.obra.getPrecio());
		insertar.insertarTime(4, this.obra.getDuracion());
		insertar.insertarString(5, this.obra.getDescripcion());
		insertar.insertarString(6, this.obra.getEstado());
		int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta obra?", "Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (reply == JOptionPane.YES_OPTION) {
            insertar.confirmar();
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
	}

	private void crearEntidadObra() throws SQLException {
		this.obra = new Obra();
		this.obra.setIdRepresentante(buscarIdRepresentante());
		this.obra.setNombre(panel.getTxtFieldNombreObra().getText());
		this.obra.setPrecio(Double.parseDouble(panel.getTxtFieldPrecio().getText()));
		this.obra.setDuracion(calcularDuracion());
		this.obra.setDescripcion(this.panel.getTextAreaDescripcion().getText());
		this.obra.setEstado(AdministradorObras.ESTADO_ACTIVO);
	}

	private int buscarIdRepresentante() throws SQLException {
		int idRepresentante = -1;
		String nombreCompletoRepresentante = this.panel.getCmBoxRepresentantes().getSelectedItem().toString();
		String[] nombreRepresentante = nombreCompletoRepresentante.split(" ");
		String what = "\"" + nombreRepresentante[0] + "\"";
		Object[][] buscar = new DAO().buscarConFiltro("idRepresentante, nombre, apellido", DAO.REPRESENTANTE, "nombre", what);
		for (int i = 0; i < buscar.length; i++) {
			String nombreCompletoEncontrado = buscar[i][1].toString() + " " + buscar[i][2].toString();
			if (nombreCompletoRepresentante.equals(nombreCompletoEncontrado)) {
				idRepresentante = (Integer) buscar[i][0];
			}
		}
		return idRepresentante;
	}

	private Time calcularDuracion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		return new Time(((horas*3600000) + (minutos*60000)) - 64800000);
	}
}
