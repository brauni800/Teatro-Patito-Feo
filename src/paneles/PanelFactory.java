package paneles;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import elementos.ElementoFactory;

/**
 * 
 * @author b1796
 *
 */
public abstract class PanelFactory extends JPanel {
	
	public static final String OBRAS = "OBRAS";
	public static final String VENDER_BOLETOS = "VENDER_BOLETOS";
	public static final String REGRESAR = "REGRESAR";
	public static final String CREAR_OBRA = "CREAR_OBRA";
	public static final String ELIMINAR_OBRA = "ELIMINAR_OBRA";
	public static final String EDITAR_OBRA = "EDITAR_OBRA";
	public static final String CREAR = "CREAR";
	
	protected ElementoFactory elementoDinamico;
	protected PanelFactory panelDinamico;

	public PanelFactory() {
		super();
		setSize(950, 550);
		setBackground(Color.CYAN);
		setLayout(null);
		setVisible(true);
		initComponents();
	}

	protected abstract void initComponents();

	/**
	 * Regresa el boton que sea indicado. Si el boton indicado no es encontrado, se regresa null.
	 * @param s  - El boton que se desea.
	 * @return JButton - El boton pedido.
	 */
	public JButton getBoton(String s) {return null;}
	
	public PanelFactory getPanelDinamico() {
		return this.panelDinamico;
	}
	
	public void setElementoDinamico(ElementoFactory elementoDinamico) {
		this.elementoDinamico = elementoDinamico;
	}
	
	public void setPanelDinamico(PanelFactory panelDinamico) {
		this.panelDinamico = panelDinamico;
		add(panelDinamico);
		repaint();
	}
	
}
