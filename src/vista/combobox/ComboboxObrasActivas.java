package vista.combobox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import administradores.AdministradorObras;

@SuppressWarnings("serial")
public class ComboboxObrasActivas extends JComboBox<String>{

	public ComboboxObrasActivas() {
		super();
		setModel(crearModelo());
		setVisible(true);
	}
	private DefaultComboBoxModel<String> crearModelo() {
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>(new String[] {"Seleccionar obra"});
		AdministradorObras admin = new AdministradorObras();
		Object[][] obrasActivas = admin.buscarObrasActivas();
		for(int i = 0; i < obrasActivas.length; i++) {
			String strObra = obrasActivas[i][0].toString() + " - " + obrasActivas[i][1].toString(); 
			modelo.addElement(strObra);
		}
		return modelo;
	}
}
