package administradores;

import entidades.Obra;
import paneles.PanelFactory;

/**
 * 
 * @author brauni800
 *
 */
public class AdministradorObras {

	private PanelFactory panel;
	private Obra obra;
	
	public AdministradorObras(PanelFactory panel) {
		super();
		this.panel = panel;
	}


	public void crearObra() {
		crearEntidad();
	}
	
	private void crearEntidad() {
		this.obra = new Obra();
		//this.obra.setNombre();
	}
}
