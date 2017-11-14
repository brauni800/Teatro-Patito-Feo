package combobox;

import java.sql.SQLException;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import administradores.AdministrarComboBox;
import administradores.AdministrarTablas;

public class ComboBoxObras extends JComboBox<String>{
	

	public ComboBoxObras() {
		super();
		setModel(createModel());
		setSize(230, 40);
		
	}
	

	private ComboBoxModel<String> createModel() {
		
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
		AdministrarComboBox ad = new AdministrarComboBox();
		try {
			ad.cargarBaseDatosObras(modelo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
