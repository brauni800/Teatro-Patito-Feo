package paneles;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import combobox.ComboBoxObras;
import tablas.TablaFunciones;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
@SuppressWarnings("serial")
public class PanelVenderBoleto extends PanelFactory{
	
	public PanelVenderBoleto() {
		setBounds(300, 20, 620, 500);
	}

	
	@Override
	protected void initComponents() {
		
		initComboBox();
		initTables();
		initButtons();
		initTables();
		initLables();
	}


	protected void initComboBox() {
		cmBoxSeleccionarObra = new ComboBoxObras();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		add(cmBoxSeleccionarObra);

	}

	protected void initTables() {
		scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 150, 500, 200);
		add(scrollPane);

		table = new TablaFunciones(0);
		scrollPane.setViewportView(table);
	}

	protected void initButtons() {
		
		btnVenderAsientos = new JButton("Comprar Boletos");
		btnVenderAsientos.setBounds(263, 445, 150, 23);
		btnVenderAsientos.setEnabled(true);
		add(btnVenderAsientos);
		
		btnMostrarFunciones = new JButton("Mostrar Funciones");
		btnMostrarFunciones.setBounds(100, 445, 150, 23);
		btnMostrarFunciones.setEnabled(true);
		add(btnMostrarFunciones);
	}

	protected void initLables() {

		lblSeleccionarObra = new JLabel("Seleccionar obra:");
		lblSeleccionarObra.setBounds(93, 39, 106, 14);
		lblSeleccionarObra.setVisible(true);
		add(lblSeleccionarObra);
	}

}
