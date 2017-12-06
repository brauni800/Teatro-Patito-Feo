package administradores;

import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

import bd.DAO;

public class AdministrarComboBox {

	public AdministrarComboBox() {
	}

	public void cargarBaseDatosObras(DefaultComboBoxModel<String> modelo) throws SQLException {

		String[] datos = new String[5];
		Object[][] buscar = new DAO().buscar("idObra,nombreObra,duracionObra,descripcionObra,idRepresentante",
				DAO.OBRA);
		for (int i = 0; i < buscar.length; i++) {
			datos[0] = buscar[i][0].toString();
			datos[1] = buscar[i][1].toString();
			modelo.addElement(datos[0] + " " + datos[1]);
		}
	}
	
	public void cargarBaseDatosRepresentantes(DefaultComboBoxModel<String> modelo) throws SQLException{
		String[] datos = new String[5];
		Object[][] buscar = new DAO().buscar("idRepresentante, nombre, apellido, telefono, telefonoAlternativo, correoElectronico",
				DAO.REPRESENTANTE);
		for (int i = 0; i < buscar.length; i++) {
			datos[0] = buscar[i][1].toString();
			datos[1] = buscar[i][2].toString();
			modelo.addElement(datos[0] + " " + datos[1]);
		}
	}
	
	public void cargarBaseDatosFunciones(DefaultComboBoxModel<String> modelo) throws SQLException{
		String[] datos = new String[5];
		Object[][] buscar = new DAO().buscar("idFuncion,fechaFuncion,inicioFuncion",
				DAO.FUNCION);
		for (int i = 0; i < buscar.length; i++) {
			datos[0] = buscar[i][0].toString();
			datos[1] = buscar[i][1].toString();
			datos[2] = buscar[i][2].toString();
			modelo.addElement(datos[0] + " " + datos[1] + " " + datos[2]);
		}
	}
}
