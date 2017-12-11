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
		btnObras.setBounds(405, 150, 150, 35);
		add(btnObras);

		btnFuncion = new JButton("Funciones");
		btnFuncion.setBounds(405, 200, 150, 35);
		add(btnFuncion);

		btnBoleto = new JButton("Vender Boletos");
		btnBoleto.setBounds(405, 250, 150, 35);
		add(btnBoleto);

		btnInformes = new JButton("Informe de Ventas");
		btnInformes.setBounds(405, 300, 150, 35);
		add(btnInformes);
	}
}
