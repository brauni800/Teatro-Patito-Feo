package elementos;

import eventos.EventosEditarObra;
import vista.paneles.PanelEditarObra;
import vista.ventanas.VentanaPrincipal;

public class ElementoEditarObra extends ElementoFactory {

	public ElementoEditarObra(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelEditarObra();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosEditarObra(ventana);
	}
}
