package administradores;

import java.sql.SQLException;
import java.sql.Time;

import javax.swing.JOptionPane;

import bd.DAO;
import entidades.Obra;
import vista.paneles.PanelFactory;

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

	public AdministradorObras() {
		super();
	}
	
	public AdministradorObras(PanelFactory panel) {
		super();
		this.panel = panel;
	}

	public boolean crearObra(String email) throws SQLException {
		boolean creado = false;
		if (!hayCamposVacios()) {
			crearEntidadObra(email);
			insertarObraBD();
			creado = true;
		}
		return creado;
	}
	
	public Obra buscarObraBD (int idObra) throws SQLException {
		Object[][] buscar = new DAO().buscarConFiltro(DAO.ALL, DAO.OBRA, "idObra", idObra);
		crearEntidadObra(buscar);
		return this.obra;
	}
	
	public Object[][] buscarObrasActivas() {
		String what = "\"" + AdministradorObras.ESTADO_ACTIVO + "\"";
		Object[][] buscar = null;
		try {
			buscar = new DAO().buscarConFiltro("idObra, nombreObra", DAO.OBRA, "estado", what);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buscar;
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
		int reply = JOptionPane.showConfirmDialog(null, "Esta seguro que desea registrar esta obra?", "Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (reply == JOptionPane.YES_OPTION) {
            insertar.confirmar();
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
	}

	private void crearEntidadObra(String email) throws SQLException {
		this.obra = new Obra();
		this.obra.setIdRepresentante(buscarIdRepresentante(email));
		this.obra.setNombre(panel.getTxtFieldNombre().getText());
		this.obra.setPrecio(Double.parseDouble(panel.getTxtFieldPrecio().getText()));
		this.obra.setDuracion(calcularDuracion());
		this.obra.setDescripcion(this.panel.getTextAreaDescripcion().getText());
		this.obra.setEstado(AdministradorObras.ESTADO_ACTIVO);
	}
	
	private void crearEntidadObra(Object[][] arreglo) throws SQLException {
		this.obra = new Obra();
		for (int i = 0; i < arreglo.length; i++) {
			this.obra.setIdObra(Integer.parseInt(arreglo[i][0].toString()));
			this.obra.setIdRepresentante(Integer.parseInt(arreglo[i][1].toString()));
			this.obra.setNombre(arreglo[i][2].toString());
			this.obra.setPrecio(Double.parseDouble(arreglo[i][3].toString()));
			this.obra.setDuracion((Time)arreglo[i][4]);
			this.obra.setDescripcion(arreglo[i][5].toString());
			this.obra.setEstado(arreglo[i][6].toString());
		}
	}

	private int buscarIdRepresentante(String email) throws SQLException {
		return new AdministradorRepresentante().buscarIDRepresentante(email);
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
	
	private boolean hayCamposVacios() {
		boolean hayCamposVacios = true;
		String fieldNombre = this.panel.getTxtFieldNombre().getText();
		String fieldPrecio = this.panel.getTxtFieldPrecio().getText();
		String fieldHoras = this.panel.getCmBoxHoras().getSelectedItem().toString();
		String fieldDescripcion = this.panel.getTextAreaDescripcion().getText();
		
		if((!fieldNombre.equals("")) && (!fieldPrecio.equals("")) && (!fieldHoras.equals("0")) && (!fieldDescripcion.equals(""))) {
			hayCamposVacios = false;
		}
		return hayCamposVacios;
	}
}
