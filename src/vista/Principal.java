package vista;

import elementos.ElementoMenuPrincipal;

public class Principal {

	public static void main(String[] args) {
		VentanaPrincipal view = new VentanaPrincipal();
		view.setElementoDinamico(new ElementoMenuPrincipal(view));
	}

}
