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
	 * Inicialización de los eventos en la venta.
	 * 
	 * @param ventanaPrincipal
	 *            Ventana en la que se ejecutarán los componentes.
	 */
	public EventosFactory(VentanaPrincipal ventanaPrincipal) {
		super();
		this.ventanaPrincipal = ventanaPrincipal;
		initEvents();
	}

	/**
	 * Asignación de listener a los botones.
	 */
	protected abstract void initEvents();

}
