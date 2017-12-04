package elementos;

import eventos.EventosCancelarBoleto;
import eventos.EventosVenderBoleto;
import paneles.PanelCancelarBoleto;
import paneles.PanelVenderBoleto;
import vista.VentanaPrincipal;

public class ElementoCancelarBoleto extends ElementoFactory {

	public ElementoCancelarBoleto(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelCancelarBoleto();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosCancelarBoleto(ventana);
	}

}
