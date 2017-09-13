package elementos;

import eventos.EventosFactory;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public abstract class ElementoFactory {

	protected PanelFactory panel;
	protected EventosFactory eventos;
	
	public ElementoFactory(VentanaPrincipal ventana) {
		super();
	}

	public PanelFactory getPanel() {
		return panel;
	}
}
