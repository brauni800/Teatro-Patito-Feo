package elementos;

import entidades.Representante;
import eventos.EventosCrearObra;
import paneles.PanelCrearObra;
import vista.VentanaPrincipal;

public class ElementoCrearObra extends ElementoFactory {
	
	public ElementoCrearObra(VentanaPrincipal ventana, Representante representante) {
		super(ventana);
		super.panel = new PanelCrearObra();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosCrearObra(ventana, representante);
	}

}
