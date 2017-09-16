package paneles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelCrearObra extends PanelCrearEditarObra {
	
	public PanelCrearObra() {
	}

	@Override
	protected void initLabels() {
		lbl1 = new JLabel("Nombre de la obra: *");
		lbl1.setBounds(116, 86, 153, 14);
		add(lbl1);

		lbl2 = new JLabel("Precio (Asiento Diamante): *");
		lbl2.setBounds(116, 146, 153, 14);
		add(lbl2);

		lbl3 = new JLabel("Duracion (horas *:min):");
		lbl3.setBounds(116, 206, 153, 14);
		add(lbl3);

		lbl4 = new JLabel("Descripcion de la obra: *");
		lbl4.setBounds(116, 260, 153, 14);
		add(lbl4);
		
		lbl5 = new JLabel("Seleccionar obra:");
		lbl5.setBounds(93, 39, 106, 14);
		lbl5.setVisible(false);
		add(lbl5);
		
		lbl6 = new JLabel("Los campos con (*) son obligatorios");
		lbl6.setBounds(10, 480, 220, 14);
		add(lbl6);
	}

	@Override
	protected void initTextFields() {
		txtFieldNombre = new JTextField();
		txtFieldNombre.setBounds(304, 83, 200, 20);
		add(txtFieldNombre);

		txtFieldPrecio = new JTextField();
		txtFieldPrecio.setBounds(304, 143, 200, 20);
		add(txtFieldPrecio);
	}

	@Override
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
		
		cmBoxSeleccionar = new JComboBox<String>();
		cmBoxSeleccionar.setBounds(231, 36, 311, 20);
		cmBoxSeleccionar.setVisible(false);
		add(cmBoxSeleccionar);
	}

	@Override
	protected void initTextArea() {
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(116, 275, 388, 71);
		add(textAreaDescripcion);
	}

	@Override
	protected void initButtons() {
		btnCrear = new JButton("Crear");
		btnCrear.setBounds(263, 445, 89, 23);
		add(btnCrear);
		
		btnAnterior = new JButton("Atras");
		btnAnterior.setBounds(5, 5, 89, 23);
		add(btnAnterior);
	}

}
