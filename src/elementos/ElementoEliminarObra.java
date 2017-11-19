package elementos;

import eventos.EventosCancelarObra;
import paneles.PanelCancelarObra;
import vista.VentanaPrincipal;

public class ElementoEliminarObra extends ElementoFactory {

	public ElementoEliminarObra(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelCancelarObra();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosCancelarObra(ventana);
	}

}
