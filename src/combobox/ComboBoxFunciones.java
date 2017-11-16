package combobox;

import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import administradores.AdministrarComboBox;

public class ComboBoxFunciones extends JComboBox<String> {
	
	public ComboBoxFunciones() {
		super();
		setModel(createModel());
	}
	
	public DefaultComboBoxModel<String> createModel(){
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		AdministrarComboBox ad = new AdministrarComboBox();
		try {
			ad.cargarBaseDatosObras(model);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return model;
	}
}
