package elementos;

import eventos.EventosVenderBoleto;
import paneles.PanelVenderBoleto;
import vista.VentanaPrincipal;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
public class ElementoVenderBoletos extends ElementoFactory {

	public ElementoVenderBoletos(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelVenderBoleto();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosVenderBoleto(ventana);
	}

}
