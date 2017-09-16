package elementos;

import eventos.EventosRepresentante;
import paneles.PanelEditarRepresentante;
import vista.VentanaPrincipal;

public class ElementoEditarRepresentante extends ElementoFactory {

	public ElementoEditarRepresentante(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelEditarRepresentante();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosRepresentante(ventana);
	}

}
