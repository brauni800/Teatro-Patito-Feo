package administradores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

import bd.DAO;

public class AdministrarComboBox{

	public AdministrarComboBox() {
	}

	public void cargarBaseDatosObras(DefaultComboBoxModel<String> modelo) throws SQLException {

		String[] datos = new String[5];
		Object[][] buscar = new DAO().buscar("idObra,nombreObra,duracionObra,descripcionObra,idRepresentante",
				DAO.OBRA);

		for (int i = 0; i < buscar.length; i++) {
			datos[1] = buscar[i][1].toString();
			modelo.addElement(datos[1]);
		}
	}
}
