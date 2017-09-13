package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import interaccionPaneles.InteraccionPanelMenuPrincipal;

/**
 * 
 * @author brauni800
 *
 */
public class PanelMenuPrincipal extends JPanel {

	private JButton btnObras, btnVenderBoletos;
	private JPanel panelObras;
	InteraccionPanelMenuPrincipal interaccionPanelMenuPrincipal;
	
	/**
	 * Create the panel.
	 */
	public PanelMenuPrincipal() {
		setBackground(Color.CYAN);
        setBounds(10, 10, 905, 500);
        setVisible(true);
        setLayout(null);
        
        initCompponents();
        initEvents();
	}

	private void initCompponents() {
		btnObras = new JButton("Obras");
		btnObras.setBounds(50, 50, 150, 23);
        add(btnObras);
        
        btnVenderBoletos = new JButton("Vender Boletos");
        btnVenderBoletos.setBounds(50, 100, 150, 23);
        add(btnVenderBoletos);
        
        initEvents();
    }
	
	private void initEvents() {
		interaccionPanelMenuPrincipal = new InteraccionPanelMenuPrincipal(this);
	}
	public JButton getBtnObras() {
		return btnObras;
	}
	public JButton getBtnVenderBoletos() {
		return btnVenderBoletos;
	}
	public JPanel getPanelObras() {
		return panelObras;
	}
	public void setPanelObras(JPanel panelObras) {
		this.panelObras = panelObras;
	}
	public void setBtnObras(JButton btnObras) {
		this.btnObras = btnObras;
	}
	public void setBtnVenderBoletos(JButton btnVenderBoletos) {
		this.btnVenderBoletos = btnVenderBoletos;
	}
}
