package paneles;

import java.awt.Color;
import javax.swing.JTable;

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
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField txtFieldSeleccion;
	private JLabel lblSeleccion;
	private JButton btnEliminar;

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
		
		lblSeleccion = new JLabel("Seleccion:");
		lblSeleccion.setBounds(70, 424, 84, 14);
		add(lblSeleccion);
		
		txtFieldSeleccion = new JTextField();
		txtFieldSeleccion.setBounds(164, 421, 202, 20);
		txtFieldSeleccion.setEnabled(false);
		add(txtFieldSeleccion);
		
		eliminar = new JButton("Eliminar");
		eliminar.setBounds(441, 420, 89, 23);
		add(eliminar);
	}
}
