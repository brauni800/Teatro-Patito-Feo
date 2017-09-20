package elementos;

import eventos.EventosRepresentante;
import vista.paneles.PanelEditarRepresentante;
import vista.ventanas.VentanaPrincipal;

public class ElementoEditarRepresentante extends ElementoFactory {

	public ElementoEditarRepresentante(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelEditarRepresentante();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosRepresentante(ventana);
	}

}
