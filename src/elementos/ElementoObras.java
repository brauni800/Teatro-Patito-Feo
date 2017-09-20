package elementos;

import eventos.EventosObras;
import vista.paneles.PanelObras;
import vista.ventanas.VentanaPrincipal;

public class ElementoObras extends ElementoFactory {

	public ElementoObras(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelObras();
		ventana.setPanelDinamico(super.panel);
		super.eventos = new EventosObras(ventana);
	}

}
