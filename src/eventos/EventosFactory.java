package eventos;

import java.awt.event.ActionListener;

import vista.ventanas.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public abstract class EventosFactory implements ActionListener {

	protected VentanaPrincipal ventanaPrincipal;

	public EventosFactory(VentanaPrincipal ventanaPrincipal) {
		super();
		this.ventanaPrincipal = ventanaPrincipal;
		initEvents();
	}
	
	protected abstract void initEvents();
	
}
