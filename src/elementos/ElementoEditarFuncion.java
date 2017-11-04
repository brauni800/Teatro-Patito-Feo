package elementos;

import eventos.EventosEditarFuncion;
import paneles.PanelEditarFuncion;
import vista.VentanaPrincipal;

public class ElementoEditarFuncion extends ElementoFactory{

	public ElementoEditarFuncion(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelEditarFuncion();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosEditarFuncion(ventana);
	}

}
