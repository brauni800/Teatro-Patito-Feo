package vista;


import javax.swing.JFrame;

import elementos.ElementoFactory;
import paneles.PanelFactory;

/**
 * 
 * @author brauni800
 *
 */
public class VentanaPrincipal extends JFrame {

	private ElementoFactory elementoDinamico;
	private PanelFactory panelDinamico;
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(950, 580);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setVisible(true);
	}
	public ElementoFactory getElementoDinamico() {
		return elementoDinamico;
	}
	public void setElementoDinamico(ElementoFactory elementoDinamico) {
		this.elementoDinamico = elementoDinamico;
	}
	public void setPanelDinamico(PanelFactory panelDinamico) {
		this.panelDinamico = panelDinamico;
		setContentPane(this.panelDinamico);
		repaint();
	}
	public PanelFactory getPanelDinamico() {
		return panelDinamico;
	}
}
