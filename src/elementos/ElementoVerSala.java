package elementos;

import eventos.EventosVerSala;
import paneles.PanelVerSala;
import vista.VentanaPrincipal;

public class ElementoVerSala extends ElementoFactory {

	public ElementoVerSala(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelVerSala();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosVerSala(ventana);
	}

}
