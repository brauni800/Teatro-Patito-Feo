package paneles;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import combobox.ComboBoxObras;
import tablas.TablaFunciones;

@SuppressWarnings("serial")
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
	}

	protected void initComboBox() {
		cmBoxSeleccionarObra = new ComboBoxObras();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		add(cmBoxSeleccionarObra);
	}

	protected void initButton() {
		btnCancelarFuncion = new JButton("Cancelar");
		btnCancelarFuncion.setBounds(441, 445, 89, 23);
		add(btnCancelarFuncion);

		btnMostrarFunciones = new JButton("Mostrar Funcionens");
		btnMostrarFunciones.setBounds(100, 445, 150, 23);
		btnMostrarFunciones.setEnabled(true);
		add(btnMostrarFunciones);
	}

	protected void initTable() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 150, 500, 200);
		add(scrollPane);

		table = new TablaFunciones(0);
		scrollPane.setViewportView(table);
	}

	protected void initLabels() {
		lblSeleccion = new JLabel("Obra:");
		lblSeleccion.setBounds(150, 36, 311, 20);
		add(lblSeleccion);
	}

}
