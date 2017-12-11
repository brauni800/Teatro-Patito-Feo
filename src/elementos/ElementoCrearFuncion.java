package elementos;

import eventos.EventosCrearFuncion;
import paneles.PanelCrearFuncion;
import vista.VentanaPrincipal;

public class ElementoCrearFuncion extends ElementoFactory {

	public ElementoCrearFuncion(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelCrearFuncion();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosCrearFuncion(ventana);
	}
}
