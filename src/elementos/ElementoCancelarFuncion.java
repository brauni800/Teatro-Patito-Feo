package elementos;

import eventos.EventosCancelarFuncion;
import paneles.PanelCancelarFuncion;
import vista.VentanaPrincipal;

public class ElementoCancelarFuncion extends ElementoFactory{

	public ElementoCancelarFuncion(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelCancelarFuncion();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosCancelarFuncion(ventana);
	}

}
