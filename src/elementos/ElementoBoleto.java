package elementos;

import eventos.EventosBoleto;
import paneles.PanelBoletos;
import vista.VentanaPrincipal;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
public class ElementoBoleto extends ElementoFactory{

	public ElementoBoleto(VentanaPrincipal ventana) {
		super(ventana);
		super.panel = new PanelBoletos();
		ventana.setPanelDinamico(super.panel);
		super.eventos = new EventosBoleto(ventana);
	}

}
