package administradores;

import entidades.Funcion;
import paneles.PanelFactory;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
public class AdministradorBoletos {

	private PanelFactory panel;
	private Funcion funcion;
	private boolean validarDatosCompletos;

	public AdministradorBoletos(PanelFactory panel) {
		super();
		this.panel = panel;
		this.validarDatosCompletos = true;
	}

	public void venderBoleto() {
		System.out.println("vender");
		
	}

	public void verSala() {
		System.out.println("ver Sala");
		
		
	}

	public void cancelarBoleto() {
		System.out.println("Cancelar");
		
	}
	
	
}
