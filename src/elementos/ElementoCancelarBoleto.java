package elementos;

import eventos.EventosCancelarBoleto;
import paneles.PanelCancelarBoleto;
import vista.VentanaPrincipal;

public class ElementoCancelarBoleto extends ElementoFactory {

	public ElementoCancelarBoleto(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelCancelarBoleto();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosCancelarBoleto(ventana);
	}

}
