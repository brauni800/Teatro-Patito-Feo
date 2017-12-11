package elementos;

import eventos.EventosMenuPrincipal;
import paneles.PanelMenuPrincipal;
import vista.VentanaPrincipal;

public class ElementoMenuPrincipal extends ElementoFactory {

	public ElementoMenuPrincipal(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelMenuPrincipal();
		ventana.setPanelDinamico(super.panel);
		super.eventos = new EventosMenuPrincipal(ventana);
	}

}
