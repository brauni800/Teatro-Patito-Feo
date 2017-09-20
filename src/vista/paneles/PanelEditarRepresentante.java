package vista.paneles;

import javax.swing.JButton;

/**
 * 
 * @author brauni800
 *
 */
@SuppressWarnings("serial")
public class PanelEditarRepresentante extends PanelAgregarEditarRepresentante {

	@Override
	protected void initButtons() {
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(521, 5, 89, 23);
		btnSiguiente.setVisible(false);
		add(btnSiguiente);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(263, 445, 100, 23);
		btnActualizar.setVisible(true);
		add(btnActualizar);
		
		btnAnterior = new JButton("Atras");
		btnAnterior.setBounds(5, 5, 89, 23);
		btnAnterior.setVisible(true);
		add(btnAnterior);
	}
}
