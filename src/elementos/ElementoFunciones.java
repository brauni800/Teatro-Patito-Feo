package elementos;

import eventos.EventosFunciones;
import paneles.PanelFunciones;
import vista.VentanaPrincipal;

public class ElementoFunciones extends ElementoFactory {

	public ElementoFunciones(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelFunciones();
		ventana.setPanelDinamico(super.panel);
		super.eventos = new EventosFunciones(ventana);
	}

}
