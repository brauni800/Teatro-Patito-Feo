package combobox;

import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import administradores.AdministrarComboBox;

@SuppressWarnings("serial")
public class ComboBoxRepresentantes extends JComboBox<String>{
	
	public ComboBoxRepresentantes() {
		super();
		setModel(createModel());
	} 
	
	public DefaultComboBoxModel<String> createModel() {

		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		AdministrarComboBox ad = new AdministrarComboBox();
		try {
			ad.cargarBaseDatosRepresentantes(model);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return model;
	}
}
