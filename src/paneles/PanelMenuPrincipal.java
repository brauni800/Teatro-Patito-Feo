package paneles;

import javax.swing.JButton;

/**
 * 
 * @author b1796
 *
 */
public class PanelMenuPrincipal extends PanelFactory {
	
	private JButton btnObras, btnVenderBoletos;
	/**
	 * Create the panel.
	 */
	public PanelMenuPrincipal() {
		
	}

	@Override
	protected void initComponents() {
		this.btnObras = new JButton("Obras");
		this.btnObras.setBounds(50, 50, 150, 23);
		add(this.btnObras);
		
		this.btnVenderBoletos = new JButton("Vender Boletos");
		this.btnVenderBoletos.setBounds(50, 100, 150, 23);
        add(this.btnVenderBoletos);
	}

	@Override
	public JButton getBoton(String s) {
		JButton boton = null;
		switch(s) {
		case PanelFactory.OBRAS:
			boton = btnObras;
			break;
		case PanelFactory.VENDER_BOLETOS:
			boton = btnVenderBoletos;
			break;
		}
		return boton;
	}
}
