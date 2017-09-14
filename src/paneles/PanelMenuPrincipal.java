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
		obras = new JButton("Obras");
		obras.setBounds(50, 50, 150, 23);
		add(obras);
		
		venderBoletos = new JButton("Vender Boletos");
		venderBoletos.setBounds(50, 100, 150, 23);
        add(venderBoletos);
	}
}
