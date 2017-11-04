package paneles;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class PanelCrearFuncion extends PanelFactory{

	public PanelCrearFuncion() {
		setBackground(Color.GREEN);
		setBounds(300, 20, 620, 500);
	} 
	@Override
	protected void initComponents() {
		
		initLabels();
		initComboBox();
		initButtons();
		
	}
	
	protected void initLabels() {
		lblSeleccionarObra = new JLabel("Seleccionar obra:");
		lblSeleccionarObra.setBounds(93, 39, 106, 14);
		lblSeleccionarObra.setVisible(false);
		add(lblSeleccionarObra);
	}

	protected void initComboBox() {
		cmBoxHoras = new JComboBox<Integer>();
		cmBoxHoras.setModel(
				new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		cmBoxHoras.setBounds(304, 200, 85, 20);
		add(cmBoxHoras);

		cmBoxMinutos = new JComboBox<Integer>();
		cmBoxMinutos.setModel(new DefaultComboBoxModel<Integer>(
				new Integer[] { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 }));
		cmBoxMinutos.setBounds(419, 200, 85, 20);
		add(cmBoxMinutos);
		
		cmBoxSeleccionarObra = new JComboBox<String>();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		cmBoxSeleccionarObra.setVisible(false);
		add(cmBoxSeleccionarObra);
	}

	protected void initButtons() {
		btnCrear = new JButton("Crear");
		btnCrear.setBounds(263, 445, 89, 23);
		add(btnCrear);
	}


}
