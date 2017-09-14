package paneles;

import java.awt.Color;

import tablas.tablaObras;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 * 
 * @author b1796
 *
 */
public class PanelEliminarObra extends PanelFactory {

	/**
	 * Create the panel.
	 */
	public PanelEliminarObra() {
		setBackground(Color.GREEN);
		setBounds(300, 20, 620, 500);
	}

	@Override
	protected void initComponents() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 45, 500, 340);
		add(scrollPane);
		
		table = new tablaObras();
		scrollPane.setViewportView(table);
		
		lbl1 = new JLabel("Seleccion:");
		lbl1.setBounds(70, 424, 84, 14);
		add(lbl1);
		
		txtFieldSeleccion = new JTextField();
		txtFieldSeleccion.setBounds(164, 421, 202, 20);
		txtFieldSeleccion.setEnabled(false);
		add(txtFieldSeleccion);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(441, 420, 89, 23);
		add(btnEliminar);
	}
}
