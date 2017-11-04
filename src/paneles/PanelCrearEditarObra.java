package paneles;

import java.awt.Color;


public abstract class PanelCrearEditarObra extends PanelFactory {

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

	protected abstract void initLabels();

	protected abstract void initTextFields();

	protected abstract void initComboBox();

	protected abstract void initTextArea();

	protected abstract void initButtons();
}
