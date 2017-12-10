package eventos;

import java.awt.event.ActionListener;

import vista.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public abstract class EventosFactory implements ActionListener {

	protected VentanaPrincipal ventanaPrincipal;

	/**
	 * Inicializaci�n de los eventos en la venta.
	 * @param ventanaPrincipal Ventana en la que se ejecutar�n los componentes.
	 */
	public EventosFactory(VentanaPrincipal ventanaPrincipal) {
		super();
		this.ventanaPrincipal = ventanaPrincipal;
		initEvents();
	}
	
	/**
	 * Asignaci�n de listener a los botones.
	 */
	protected abstract void initEvents();
	
}
