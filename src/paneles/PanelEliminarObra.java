package paneles;

import java.awt.Color;
import java.sql.SQLException;

import tablas.TablaObras;

import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 * 
 * @author b1796
 *
 */
@SuppressWarnings("serial")
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
		lbl1 = new JLabel("Seleccion:");
		lbl1.setBounds(70, 424, 84, 14);
		add(lbl1);
		
		txtFieldSeleccion = new JTextField();
		txtFieldSeleccion.setBounds(164, 421, 202, 20);
		txtFieldSeleccion.setEnabled(false);
		add(txtFieldSeleccion);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(441, 420, 89, 23);
		btnEliminar.setEnabled(false);
		add(btnEliminar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 45, 500, 340);
		add(scrollPane);
		
		try {
			table = new TablaObras(0, new JComponent[] {btnEliminar});
		} catch (SQLException e) {
			e.printStackTrace();
		}
		scrollPane.setViewportView(table);
	}
}
