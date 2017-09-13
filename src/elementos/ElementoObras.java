package elementos;

import eventos.EventosObras;
import paneles.PanelObras;
import vista.VentanaPrincipal;

public class ElementoObras extends ElementoFactory {

	public ElementoObras(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelObras();
		ventana.setPanelDinamico(super.panel);
		super.eventos = new EventosObras(ventana);
	}

}
