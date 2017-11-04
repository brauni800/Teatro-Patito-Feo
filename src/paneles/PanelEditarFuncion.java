package paneles;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * 
 */

public class PanelEditarFuncion extends PanelFactory{

	public PanelEditarFuncion() {
		setBackground(Color.GREEN);
		setBounds(300, 20, 620, 500);
	}
	@Override
	protected void initComponents() {
		
		initLabels();
		initComboBox();
		initTextArea();
		initButtons();
	}
	
	protected void initLabels() {
		lblSeleccionarObra = new JLabel("Seleccionar obra:");
		lblSeleccionarObra.setBounds(93, 39, 106, 14);
		lblSeleccionarObra.setVisible(true);
		add(lblSeleccionarObra);
	}
	
	protected void initComboBox() {
		cmBoxHoras = new JComboBox<Integer>();
		cmBoxHoras.setModel(
				new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		cmBoxHoras.setBounds(304, 200, 85, 20);
		cmBoxHoras.setEnabled(false);
		add(cmBoxHoras);

		cmBoxMinutos = new JComboBox<Integer>();
		cmBoxMinutos.setModel(new DefaultComboBoxModel<Integer>(
				new Integer[] { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 }));
		cmBoxMinutos.setBounds(419, 200, 85, 20);
		cmBoxMinutos.setEnabled(false);
		add(cmBoxMinutos);
		
		cmBoxSeleccionarObra = new JComboBox<String>();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		cmBoxSeleccionarObra.setVisible(true);
		add(cmBoxSeleccionarObra);
	}
	
	protected void initTextArea() {
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(116, 335, 388, 71);
		textAreaDescripcion.setEnabled(false);
		add(textAreaDescripcion);
	}

	protected void initButtons() {
		btnEditar = new JButton("Actualizar");
		btnEditar.setBounds(263, 445, 100, 23);
		btnEditar.setEnabled(false);
		add(btnEditar);
	}

}
