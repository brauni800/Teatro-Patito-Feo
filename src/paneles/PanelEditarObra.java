package paneles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelEditarObra extends PanelCrearEditarObra {
	
	public PanelEditarObra() {
	}

	@Override
	protected void initLabels() {
		lbl1 = new JLabel("Nombre de la obra:");
		lbl1.setBounds(116, 86, 153, 14);
		lbl1.setEnabled(false);
		add(lbl1);

		lbl2 = new JLabel("Precio (Asiento Diamante):");
		lbl2.setBounds(116, 146, 153, 14);
		lbl2.setEnabled(false);
		add(lbl2);

		lbl3 = new JLabel("Duracion (horas:min):");
		lbl3.setBounds(116, 206, 153, 14);
		lbl3.setEnabled(false);
		add(lbl3);

		lbl4 = new JLabel("Representante:");
		lbl4.setBounds(116, 266, 153, 14);
		lbl4.setEnabled(false);
		add(lbl4);

		lbl5 = new JLabel("Descripcion de la obra:");
		lbl5.setBounds(116, 318, 153, 14);
		lbl5.setEnabled(false);
		add(lbl5);
		
		lbl6 = new JLabel("Seleccionar obra:");
		lbl6.setBounds(93, 39, 106, 14);
		lbl6.setVisible(true);
		add(lbl6);
	}

	@Override
	protected void initTextFields() {
		txtFieldNombre = new JTextField();
		txtFieldNombre.setBounds(304, 83, 200, 20);
		txtFieldNombre.setEnabled(false);
		add(txtFieldNombre);

		txtFieldPrecio = new JTextField();
		txtFieldPrecio.setBounds(304, 143, 200, 20);
		txtFieldPrecio.setEnabled(false);
		add(txtFieldPrecio);
	}

	@Override
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

		cmBoxRepresentantes = new JComboBox<String>();
		cmBoxRepresentantes.setBounds(304, 263, 200, 20);
		cmBoxRepresentantes.setEnabled(false);
		add(cmBoxRepresentantes);
		
		cmBoxSeleccionar = new JComboBox<String>();
		cmBoxSeleccionar.setBounds(231, 36, 311, 20);
		cmBoxSeleccionar.setVisible(true);
		add(cmBoxSeleccionar);
	}

	@Override
	protected void initTextArea() {
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(116, 335, 388, 71);
		textAreaDescripcion.setEnabled(false);
		add(textAreaDescripcion);
	}

	@Override
	protected void initButtons() {
		btnEditar = new JButton("Actualizar");
		btnEditar.setBounds(263, 445, 100, 23);
		btnEditar.setEnabled(false);
		add(btnEditar);
	}

}
