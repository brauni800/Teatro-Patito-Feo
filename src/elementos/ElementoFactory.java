package elementos;

import eventos.EventosFactory;
import vista.paneles.PanelFactory;
import vista.ventanas.VentanaPrincipal;

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
