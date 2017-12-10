package vista;

import elementos.ElementoMenuPrincipal;

public class Principal {

	/**
	 * Método prinicipal donde se inicializa el sistema.
	 * 
	 * @param args
	 *            Argumentos iniciales del sistema.
	 */
	public static void main(String[] args) {
		VentanaPrincipal view = new VentanaPrincipal();
		view.setElementoDinamico(new ElementoMenuPrincipal(view));
	}

}
