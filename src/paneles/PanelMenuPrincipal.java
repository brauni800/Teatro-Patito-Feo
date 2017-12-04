package paneles;

import javax.swing.JButton;

/**
 * 
 * @author b1796
 *
 */
@SuppressWarnings("serial")
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
        
		btnFuncion = new JButton("Funciones");
		btnFuncion.setBounds(50, 100, 150, 23);
		add(btnFuncion);
		
		btnBoleto = new JButton("Vender Boletos");
		btnBoleto.setBounds(50, 150, 150, 23);
        add(btnBoleto);
        
        btnInformes = new JButton("Informe de Ventas");
        btnInformes.setBounds(50, 200, 150, 23);
        add(btnInformes);
	}
}
