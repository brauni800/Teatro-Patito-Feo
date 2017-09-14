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
		lblNombreObra = new JLabel("Nombre de la obra:");
		lblNombreObra.setBounds(116, 86, 153, 14);
		lblNombreObra.setEnabled(false);
		add(lblNombreObra);

		lblPrecio = new JLabel("Precio (Asiento Diamante):");
		lblPrecio.setBounds(116, 146, 153, 14);
		lblPrecio.setEnabled(false);
		add(lblPrecio);

		lblDuracion = new JLabel("Duracion (horas:min):");
		lblDuracion.setBounds(116, 206, 153, 14);
		lblDuracion.setEnabled(false);
		add(lblDuracion);

		lblRepresentante = new JLabel("Representante:");
		lblRepresentante.setBounds(116, 266, 153, 14);
		lblRepresentante.setEnabled(false);
		add(lblRepresentante);

		lblDescripcion = new JLabel("Descripcion de la obra:");
		lblDescripcion.setBounds(116, 318, 153, 14);
		lblDescripcion.setEnabled(false);
		add(lblDescripcion);
		
		lblSeleccionarObra = new JLabel("Seleccionar obra:");
		lblSeleccionarObra.setBounds(93, 39, 106, 14);
		lblSeleccionarObra.setVisible(true);
		add(lblSeleccionarObra);
	}

	@Override
	protected void initTextFields() {
		txtFieldNombreObra = new JTextField();
		txtFieldNombreObra.setBounds(304, 83, 200, 20);
		txtFieldNombreObra.setEnabled(false);
		add(txtFieldNombreObra);

		txtFieldPrecio = new JTextField();
		txtFieldPrecio.setBounds(304, 143, 200, 20);
		txtFieldPrecio.setEnabled(false);
		add(txtFieldPrecio);
	}

	@Override
	protected void initComboBox() {
		cmBoxHoras = new JComboBox<String>();
		cmBoxHoras.setModel(
				new DefaultComboBoxModel<String>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		cmBoxHoras.setBounds(304, 200, 85, 20);
		cmBoxHoras.setEnabled(false);
		add(cmBoxHoras);

		cmBoxMinutos = new JComboBox<String>();
		cmBoxMinutos.setModel(new DefaultComboBoxModel<String>(
				new String[] { "0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));
		cmBoxMinutos.setBounds(419, 200, 85, 20);
		cmBoxMinutos.setEnabled(false);
		add(cmBoxMinutos);

		cmBoxRepresentantes = new JComboBox<String>();
		cmBoxRepresentantes.setBounds(304, 263, 200, 20);
		cmBoxRepresentantes.setEnabled(false);
		add(cmBoxRepresentantes);
		
		cmBoxSeleccionarObra = new JComboBox<String>();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		cmBoxSeleccionarObra.setVisible(true);
		add(cmBoxSeleccionarObra);
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
