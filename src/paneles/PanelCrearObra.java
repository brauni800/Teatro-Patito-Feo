package paneles;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class PanelCrearObra extends PanelFactory {

	private JTextField txtFieldNombreObra, txtFieldPrecio;
	private JLabel lblNombreObra, lblPrecio, lblDuracion, lblRepresentante, lblDescripcion;
	private JComboBox<String> cmBoxHoras, cmBoxMinutos, cmBoxRepresentantes;
	private JTextArea textAreaDescripcion;
	private JButton btnCrear;

	/**
	 * Create the panel.
	 */
	public PanelCrearObra() {
		setBackground(Color.GREEN);
		setBounds(300, 20, 620, 500);
	}

	@Override
	protected void initComponents() {
		initLabels();
		initTextFields();
		initComboBox();
		initTextArea();
		initButtons();
	}

	@Override
	public JButton getBoton(String s) {
		JButton boton = null;
		switch(s) {
		case PanelFactory.CREAR:
			boton = this.btnCrear;
			break;
		}
		return boton;
	}

	private void initLabels() {
		lblNombreObra = new JLabel("Nombre de la obra:");
		lblNombreObra.setBounds(116, 70, 153, 14);
		add(lblNombreObra);

		lblPrecio = new JLabel("Precio (Asiento Diamante):");
		lblPrecio.setBounds(116, 130, 153, 14);
		add(lblPrecio);

		lblDuracion = new JLabel("Duracion (horas:min):");
		lblDuracion.setBounds(116, 190, 153, 14);
		add(lblDuracion);

		lblRepresentante = new JLabel("Representante:");
		lblRepresentante.setBounds(116, 250, 153, 14);
		add(lblRepresentante);

		lblDescripcion = new JLabel("Descripcion de la obra:");
		lblDescripcion.setBounds(116, 302, 153, 14);
		add(lblDescripcion);
	}

	private void initTextFields() {
		txtFieldNombreObra = new JTextField();
		txtFieldNombreObra.setBounds(304, 67, 200, 20);
		add(txtFieldNombreObra);

		txtFieldPrecio = new JTextField();
		txtFieldPrecio.setBounds(304, 127, 200, 20);
		add(txtFieldPrecio);
	}

	private void initComboBox() {
		cmBoxHoras = new JComboBox<String>();
		cmBoxHoras.setModel(
				new DefaultComboBoxModel<String>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		cmBoxHoras.setBounds(304, 184, 85, 20);
		add(cmBoxHoras);

		cmBoxMinutos = new JComboBox<String>();
		cmBoxMinutos.setModel(new DefaultComboBoxModel<String>(
				new String[] { "0", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));
		cmBoxMinutos.setBounds(419, 184, 85, 20);
		add(cmBoxMinutos);

		cmBoxRepresentantes = new JComboBox<String>();
		cmBoxRepresentantes.setBounds(304, 247, 200, 20);
		add(cmBoxRepresentantes);
	}

	private void initTextArea() {
		textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(116, 319, 388, 71);
		add(textAreaDescripcion);
	}

	private void initButtons() {
		btnCrear = new JButton("Crear");
		btnCrear.setBounds(263, 429, 89, 23);
		add(btnCrear);
	}
}
