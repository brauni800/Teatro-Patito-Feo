package paneles;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import combobox.ComboBoxRepresentantes;

@SuppressWarnings("serial")
public class PanelCrearObra extends PanelCrearEditarObra {

	public PanelCrearObra() {
	}

	@Override
	protected void initLabels() {
		lblNombreObra = new JLabel("Nombre de la obra:");
		lblNombreObra.setBounds(116, 86, 153, 14);
		add(lblNombreObra);

		lblPrecio = new JLabel("Precio (Asiento Diamante):");
		lblPrecio.setBounds(116, 146, 153, 14);
		add(lblPrecio);

		lblDuracion = new JLabel("Duracion (horas:min):");
		lblDuracion.setBounds(116, 206, 153, 14);
		add(lblDuracion);

		lblRepresentante = new JLabel("Representante:");
		lblRepresentante.setBounds(116, 266, 153, 14);
		add(lblRepresentante);

		lblDescripcion = new JLabel("Descripcion de la obra:");
		lblDescripcion.setBounds(116, 318, 153, 14);
		add(lblDescripcion);

		lblSeleccionarObra = new JLabel("Seleccionar obra:");
		lblSeleccionarObra.setBounds(93, 39, 106, 14);
		lblSeleccionarObra.setVisible(false);
		add(lblSeleccionarObra);
	}

	@Override
	protected void initTextFields() {
		txtFieldNombreObra = new JTextField();
		txtFieldNombreObra.setBounds(304, 83, 200, 20);
		add(txtFieldNombreObra);

		txtFieldPrecio = new JTextField();
		txtFieldPrecio.setBounds(304, 143, 200, 20);
		add(txtFieldPrecio);
	}

	@Override
	protected void initComboBox() {
		cmBoxHoras = new JComboBox<Integer>();
		cmBoxHoras.setModel(new DefaultComboBoxModel<Integer>(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		cmBoxHoras.setBounds(304, 200, 85, 20);
		add(cmBoxHoras);

		cmBoxMinutos = new JComboBox<Integer>();
		cmBoxMinutos.setModel(
				new DefaultComboBoxModel<Integer>(new Integer[] { 0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55 }));
		cmBoxMinutos.setBounds(419, 200, 85, 20);
		add(cmBoxMinutos);

		cmBoxRepresentantes = new ComboBoxRepresentantes();
		cmBoxRepresentantes
				.setModel(new DefaultComboBoxModel<String>(new String[] { "Rogelio Campos", "Ricardo Perez" }));
		cmBoxRepresentantes.setBounds(304, 263, 200, 20);
		add(cmBoxRepresentantes);

		cmBoxSeleccionarObra = new JComboBox<String>();
		cmBoxSeleccionarObra.setBounds(231, 36, 311, 20);
		cmBoxSeleccionarObra.setVisible(false);
		add(cmBoxSeleccionarObra);
	}

	@Override
	protected void initTextArea() {
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(116, 335, 388, 71);
		add(textAreaDescripcion);
	}

	@Override
	protected void initButtons() {
		btnCrear = new JButton("Crear Obra");
		btnCrear.setBounds(263, 445, 125, 23);
		add(btnCrear);

		btnIrAFunciones = new JButton("Crear Funcion");
		btnIrAFunciones.setBounds(400, 445, 125, 23);
		add(btnIrAFunciones);
	}

}
