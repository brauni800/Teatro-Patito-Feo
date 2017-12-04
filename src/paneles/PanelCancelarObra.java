package paneles;

import tablas.TablaObras;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * 
 * @author b1796
 *
 */
@SuppressWarnings("serial")
public class PanelCancelarObra extends PanelFactory {

	/**
	 * Create the panel.
	 */
	public PanelCancelarObra() {
		setBounds(300, 20, 620, 500);
	}

	@Override
	protected void initComponents() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 45, 500, 340);
		add(scrollPane);
		
		table = new TablaObras();
		scrollPane.setViewportView(table);
		
		lblSeleccion = new JLabel("Seleccion:");
		lblSeleccion.setBounds(70, 424, 84, 14);
		add(lblSeleccion);
		
		txtFieldSeleccion = new JTextField();
		txtFieldSeleccion.setBounds(164, 421, 202, 20);
		txtFieldSeleccion.setEnabled(false);
		add(txtFieldSeleccion);
		
		btnEliminar = new JButton("Cancelar");
		btnEliminar.setBounds(441, 420, 89, 23);
		add(btnEliminar);
	}
}
