package elementos;

import eventos.EventosCrearObra;
import paneles.PanelCrearObra;
import vista.VentanaPrincipal;

public class ElementoCrearObra extends ElementoFactory {

	public ElementoCrearObra(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelCrearObra();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosCrearObra(ventana);
	}

}
