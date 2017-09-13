package paneles;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public abstract class PanelCrearEditarObra extends PanelFactory {

	protected JTextField txtFieldNombreObra, txtFieldPrecio;
	protected JLabel lblNombreObra, lblPrecio, lblDuracion, lblRepresentante, lblDescripcion, lblSeleccionarObra;
	protected JComboBox<String> cmBoxHoras, cmBoxMinutos, cmBoxRepresentantes, cmBoxSeleccionarObra;
	protected JTextArea textAreaDescripcion;
	protected JButton btnCrearEditar;

	/**
	 * Create the panel.
	 */
	public PanelCrearEditarObra() {
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
		case PanelFactory.CREAR_EDITAR:
			boton = this.btnCrearEditar;
			break;
		}
		return boton;
	}

	protected abstract void initLabels();

	protected abstract void initTextFields();

	protected abstract void initComboBox();

	protected abstract void initTextArea();

	protected abstract void initButtons();
}
