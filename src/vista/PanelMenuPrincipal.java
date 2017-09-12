package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelMenuPrincipal extends JPanel {

	private JButton btnObras, btnVenderBoletos;
	
	/**
	 * Create the panel.
	 */
	public PanelMenuPrincipal() {
		setBackground(Color.CYAN);
        setBounds(10, 10, 905, 500);
        setVisible(true);
        setLayout(null);
        
        initCompponents();
	}

	private void initCompponents() {
		btnObras = new JButton("Obras");
		btnObras.setBounds(50, 50, 150, 23);
        add(btnObras);
        
        btnVenderBoletos = new JButton("Vender Boletos");
        btnVenderBoletos.setBounds(50, 100, 150, 23);
        add(btnVenderBoletos);
    }
}
