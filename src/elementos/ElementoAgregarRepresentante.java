package elementos;

import eventos.EventosAgregarRepresentante;
import paneles.PanelAgregarRepresentante;
import vista.VentanaPrincipal;

public class ElementoAgregarRepresentante extends ElementoFactory {

	public ElementoAgregarRepresentante(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelAgregarRepresentante();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosAgregarRepresentante(ventana);
	}

}
