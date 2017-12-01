package elementos;

import eventos.EventosAgregarResponsable;
import paneles.PanelAgregarResponsable;
import vista.VentanaPrincipal;

public class ElementoAgregarResponsable extends ElementoFactory {

	public ElementoAgregarResponsable(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelAgregarResponsable();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosAgregarResponsable(ventana);
		// TODO Auto-generated constructor stub
	}

}
