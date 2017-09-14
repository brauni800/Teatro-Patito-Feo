package administradores;

import java.sql.SQLException;

import bd.DAO;
import entidades.Representante;
import paneles.PanelFactory;

public class AdministradorRepresentante {

	private PanelFactory panel;
	private Representante representante;
	private String email;
	
	public AdministradorRepresentante(String email) {
		this.email = email;
	}

	public AdministradorRepresentante(PanelFactory panel) {
		super();
		this.panel = panel;
	}
	
	public boolean crearRepresentante() throws SQLException {
		boolean creado = false;
		if (!hayCamposVacios()) {
			crearEntidadRepresentante();
			insertarRepresentanteBD();
			creado = true;
		}
		return creado;
	}
	
	public void eliminarRepresentante() throws SQLException {
		DAO eliminar = new DAO();
		eliminar.crearEstructuraParaEliminar(DAO.REPRESENTANTE, "correoElectronico", email);
		eliminar.confirmar();
	}

	public int buscarIDRepresentante() throws SQLException {
		Object[][] buscar = new DAO().buscarConFiltro("idRepresentante", DAO.REPRESENTANTE, "correoElectronico", this.email);
		return Integer.parseInt(buscar[0][0].toString());
	}

	//***********************************************
	//***********************************************
	//***********************************************
	//***********************************************

	private void insertarRepresentanteBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.REPRESENTANTE, "nombre, apellido, telefono, telefonoAlternativo, correoElectronico");
		insertar.insertarString(1, this.representante.getNombre());
		insertar.insertarString(2, this.representante.getApellido());
		insertar.insertarString(3, this.representante.getTelefono());
		insertar.insertarString(4, this.representante.getTelefonoAlternativo());
		insertar.insertarString(5, this.representante.getEmail());
		insertar.confirmar();
	}

	private void crearEntidadRepresentante() {
		this.representante = new Representante();
		this.representante.setNombre(this.panel.getTxtFieldNombre().getText());
		this.representante.setApellido(this.panel.getTxtFieldApellido().getText());
		this.representante.setTelefono(this.panel.getTxtFieldTelefono1().getText());
		this.representante.setTelefonoAlternativo(this.panel.getTxtFieldTelefono2().getText());
		this.representante.setEmail(this.panel.getTxtFieldCorreoElectronico().getText());
	}
	
	private boolean hayCamposVacios() {
		boolean hayCamposVacios = true;
		String fieldNombre = this.panel.getTxtFieldNombre().getText();
		String fieldApellido = this.panel.getTxtFieldApellido().getText();
		String fieldTelefono1 = this.panel.getTxtFieldTelefono1().getText();
		String fieldEmail = this.panel.getTxtFieldCorreoElectronico().getText();
		
		if((!fieldNombre.equals("")) && (!fieldApellido.equals("")) && (!fieldTelefono1.equals("")) && (!fieldEmail.equals(""))) {
			hayCamposVacios = false;
		}
		return hayCamposVacios;
	}
}
