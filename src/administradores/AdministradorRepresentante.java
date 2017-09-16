package administradores;

import java.sql.SQLException;

import bd.DAO;
import entidades.Representante;
import paneles.PanelFactory;

public class AdministradorRepresentante {


	public static String buscarNombreCompletoRepresentante(int idRepresentante) throws SQLException {
		String nombreCompleto = "";
		Object[][] buscar = new DAO().buscarConFiltro("nombre, apellido", DAO.REPRESENTANTE, "idRepresentante", idRepresentante);
		for (int i = 0; i < buscar.length; i++) {
			nombreCompleto += buscar[i][0];
			nombreCompleto += (" " + buscar[i][1]);
		}
		return nombreCompleto;
	}

	private PanelFactory panel;
	private Representante representante;

	public AdministradorRepresentante() {
		
	}
	
	public AdministradorRepresentante(Representante representante) {
		this.representante = representante;
	}
	
	public AdministradorRepresentante(PanelFactory panel) {
		super();
		this.panel = panel;
	}

	public void eliminarRepresentante(String email) throws SQLException {
		String formatoCorrectoEmail = "\"" + email + "\"";
		DAO eliminar = new DAO();
		eliminar.crearEstructuraParaEliminar(DAO.REPRESENTANTE, "correoElectronico", formatoCorrectoEmail);
		eliminar.confirmar();
	}

	public int buscarIDRepresentante(String email) throws SQLException {
		String formatoCorrectoEmail = "\"" + email + "\"";
		Object[][] buscar = new DAO().buscarConFiltro("idRepresentante", DAO.REPRESENTANTE, "correoElectronico", formatoCorrectoEmail);
		return Integer.parseInt(buscar[0][0].toString());
	}

	public void insertarRepresentanteBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.REPRESENTANTE,
				"nombre, apellido, telefono, telefonoAlternativo, correoElectronico");
		insertar.insertarString(1, this.representante.getNombre());
		insertar.insertarString(2, this.representante.getApellido());
		insertar.insertarString(3, this.representante.getTelefono());
		insertar.insertarString(4, this.representante.getTelefonoAlternativo());
		insertar.insertarString(5, this.representante.getEmail());
		insertar.confirmar();
	}

	public Representante crearEntidadRepresentante() {
		if (!hayCamposVacios()) {
			this.representante = new Representante();
			this.representante.setNombre(this.panel.getTxtFieldNombre().getText());
			this.representante.setApellido(this.panel.getTxtFieldApellido().getText());
			this.representante.setTelefono(this.panel.getTxtFieldTelefono1().getText());
			this.representante.setTelefonoAlternativo(this.panel.getTxtFieldTelefono2().getText());
			this.representante.setEmail(this.panel.getTxtFieldCorreoElectronico().getText());
		}
		return this.representante;
	}

	// ***********************************************
	// ***********************************************
	// ***********************************************
	// ***********************************************
	
	private boolean hayCamposVacios() {
		boolean hayCamposVacios = true;
		String fieldNombre = this.panel.getTxtFieldNombre().getText();
		String fieldApellido = this.panel.getTxtFieldApellido().getText();
		String fieldTelefono1 = this.panel.getTxtFieldTelefono1().getText();
		String fieldEmail = this.panel.getTxtFieldCorreoElectronico().getText();

		if ((!fieldNombre.equals("")) && (!fieldApellido.equals("")) && (!fieldTelefono1.equals(""))
				&& (!fieldEmail.equals(""))) {
			hayCamposVacios = false;
		}
		return hayCamposVacios;
	}
}
