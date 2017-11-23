package paneles;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import combobox.ComboBoxObras;
import tablas.TablaFunciones;

public class PanelCancelarFuncion extends PanelFactory {

	public PanelCancelarFuncion() {
		setBounds(300, 20, 620, 500);
	}

	@Override
	protected void initComponents() {
		initButton();
		initComboBox();
		initLabels();
		initTable();
		initTextField();
	}

	protected void initComboBox() {
		cmBoxSeleccionarObra = new ComboBoxObras();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		add(cmBoxSeleccionarObra);
	}

	protected void initTextField() {
		txtFieldSeleccion = new JTextField();
		txtFieldSeleccion.setBounds(164, 421, 202, 20);
		add(txtFieldSeleccion);
	}

	protected void initButton() {
		btnCancelarFuncion = new JButton("Cancelar");
		btnCancelarFuncion.setBounds(441, 420, 89, 23);
		add(btnCancelarFuncion);
	}

	protected void initTable() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 200, 500, 200);
		add(scrollPane);

		table = new TablaFunciones();
		scrollPane.setViewportView(table);
	}

	protected void initLabels() {
		lblSeleccion = new JLabel("Obra:");
		lblSeleccion.setBounds(150, 36, 311, 20);
		add(lblSeleccion);

		lblSeleccion = new JLabel("Seleccion:");
		lblSeleccion.setBounds(70, 424, 84, 14);
		add(lblSeleccion);
	}

}
