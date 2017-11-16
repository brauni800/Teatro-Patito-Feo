package administradores;

import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import bd.DAO;

public class AdministrarComboBox{

	public AdministrarComboBox(){
		
	}
	
	public void cargarBaseDatosObras(DefaultComboBoxModel<String> modelo) throws SQLException {
		
		
		String[] datos = new String[5];
		Object[][] buscar = new DAO().buscar("idObra,nombreObra,duracionObra,descripcionObra,idRepresentante", DAO.OBRA);
			
		
		for(int i = 0; i < buscar.length; i++) {
			datos[1] = buscar[i][1].toString();
			modelo.addElement(datos[1]);
		}
		
		}
}
