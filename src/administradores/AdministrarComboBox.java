package administradores;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import bd.DAO;

public class AdministrarComboBox{

	public AdministrarComboBox(){
		
	}
	
	public void cargarBaseDatosObras(DefaultComboBoxModel<String> modelo) throws SQLException {
		
		
		String[] datos = new String[5];
		Object[][] buscar = new DAO().buscar("idObra,nombreObra,duracionObra,descripcionObra,idRepresentante", DAO.OBRA);
			
		
		for(int i = 0; i < buscar.length; i++) {
			datos[0] = buscar[i][0].toString();
			datos[1] = buscar[i][1].toString();
			datos[2] = buscar[i][2].toString();
			datos[3] = buscar[i][3].toString();
			datos[4] = buscar[i][4].toString();
			modelo.addElement(datos[1]);
		}
		
		}
}
