package vista.ventanas;


import javax.swing.JFrame;

import elementos.ElementoFactory;
import vista.paneles.PanelFactory;

/**
 * 
 * @author brauni800
 *
 */
@SuppressWarnings("serial")
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

	/**
	 * Regresa el elemento dinamico que contiene la ventana principal del programa.
	 * @return ElementoFcatory - el elemento dinamico.
	 */
	public ElementoFactory getElementoDinamico() {
		return elementoDinamico;
	}
	
	/**
	 * Insertar el elemento dinamico que contendrá la ventana.
	 * @param elementoDinamico - el elemento dinamico.
	 */
	public void setElementoDinamico(ElementoFactory elementoDinamico) {
		this.elementoDinamico = elementoDinamico;
	}
	
	/**
	 * Insertar el panel dinamico que contendrá la ventana.
	 * @param panelDinamico - el panel dinamico.
	 */
	public void setPanelDinamico(PanelFactory panelDinamico) {
		this.panelDinamico = panelDinamico;
		setContentPane(this.panelDinamico);
		repaint();
	}
	
	/**
	 * Regresa el panel dinamico que contiene la ventana principal del programa.
	 * @return - Panel Factory - el panel dinamico.
	 */
	public PanelFactory getPanelDinamico() {
		return panelDinamico;
	}
}
