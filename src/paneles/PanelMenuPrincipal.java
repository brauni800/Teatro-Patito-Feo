package paneles;

import javax.swing.JButton;

/**
 * 
 * @author b1796
 *
 */
public class PanelMenuPrincipal extends PanelFactory {
	
	/**
	 * Create the panel.
	 */
	public PanelMenuPrincipal() {
		
	}

	@Override
	protected void initComponents() {
		btnObras = new JButton("Obras");
		btnObras.setBounds(50, 50, 150, 23);
		add(btnObras);
		
		btnVenderBoletos = new JButton("Vender Boletos");
		btnVenderBoletos.setBounds(50, 100, 150, 23);
        add(btnVenderBoletos);
	}
}
