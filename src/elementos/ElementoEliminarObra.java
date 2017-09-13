package elementos;

import eventos.EventosEliminarObra;
import paneles.PanelEliminarObra;
import vista.VentanaPrincipal;

public class ElementoEliminarObra extends ElementoFactory {

	public ElementoEliminarObra(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelEliminarObra();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosEliminarObra(ventana);
	}

}
