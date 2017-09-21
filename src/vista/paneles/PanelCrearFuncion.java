package vista.paneles;

import vista.combobox.ComboboxObrasActivas;

@SuppressWarnings("serial")
public class PanelCrearFuncion extends PanelFactoryMini {

	@Override
	protected void initLabels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initTextFields() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initComboBox() {
		cmBoxSeleccionar = new ComboboxObrasActivas();
		cmBoxSeleccionar.setBounds(231, 36, 311, 20);
		add(cmBoxSeleccionar);
	}

	@Override
	protected void initTextArea() {}

	@Override
	protected void initButtons() {
		// TODO Auto-generated method stub
		
	}

}
