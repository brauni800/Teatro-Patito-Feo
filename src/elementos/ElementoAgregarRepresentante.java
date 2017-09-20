package elementos;

import eventos.EventosRepresentante;
import vista.paneles.PanelAgregarRepresentante;
import vista.ventanas.VentanaPrincipal;

public class ElementoAgregarRepresentante extends ElementoFactory {

	public ElementoAgregarRepresentante(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelAgregarRepresentante();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosRepresentante(ventana);
	}

}
