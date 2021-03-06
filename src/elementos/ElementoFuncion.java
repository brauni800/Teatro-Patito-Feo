package elementos;

import eventos.EventosFuncion;
import paneles.PanelFunciones;
import vista.VentanaPrincipal;

public class ElementoFuncion extends ElementoFactory {

	public ElementoFuncion(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelFunciones();
		ventana.setPanelDinamico(super.panel);
		super.eventos = new EventosFuncion(ventana);
	}
}
