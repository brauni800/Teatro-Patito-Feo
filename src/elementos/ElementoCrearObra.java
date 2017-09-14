package elementos;

import eventos.EventosCrearObra;
import paneles.PanelCrearObra;
import vista.VentanaPrincipal;

public class ElementoCrearObra extends ElementoFactory {

	private String emailRepresentante;
	
	public ElementoCrearObra(VentanaPrincipal ventana, String emailRepresentante) {
		super(ventana);
		this.emailRepresentante = emailRepresentante;
		super.panel = new PanelCrearObra();
		ventana.getPanelDinamico().setPanelDinamico(super.panel);
		super.eventos = new EventosCrearObra(ventana, emailRepresentante);
	}

}
