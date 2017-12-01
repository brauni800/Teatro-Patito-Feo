package administradores;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import bd.DAO;
import entidades.Representante;
import paneles.PanelFactory;

public class AdministradorResponsables {
	
	private PanelFactory panel;
	private Representante representante;
	
	public AdministradorResponsables(PanelFactory panel) {
		super();
		this.panel = panel;
	}
	
	public void crearResponsable() throws SQLException {
		crearEntidadRepresentante();
		insertarRepresentanteBD();
	}

	private void insertarRepresentanteBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.REPRESENTANTE, "nombre, apellido, telefono, telefonoAlternativo, correoElectronico");
		insertar.insertarString(1, this.representante.getNombre());
		insertar.insertarString(2, this.representante.getApellido());
		insertar.insertarString(3, this.representante.getTelefono());
		insertar.insertarString(4, this.representante.getTelefonoAlternativo());
		insertar.insertarString(5, this.representante.getEmail());
		int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar este Representante?", "Registrar Representante", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (reply == JOptionPane.YES_OPTION) {
            insertar.confirmar();
            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
	}

	private void crearEntidadRepresentante() {
		this.representante = new Representante();
		this.representante.setNombre(panel.getTxtFieldNombreRepre().getText());
		this.representante.setApellido(panel.getTxtFieldApellidoRepre().getText());
		this.representante.setTelefono(panel.getTxtFieldTelefonoRepre().getText());
		this.representante.setTelefonoAlternativo(panel.getTxtFieldTelefonoAlternativoRepre().getText());
		this.representante.setEmail(panel.getTxtFieldEmailRepre().getText());
		
	}
	
	

}
