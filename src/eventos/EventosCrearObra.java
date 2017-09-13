package eventos;

import java.awt.event.ActionEvent;

import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosCrearObra extends EventosFactory {

	public EventosCrearObra(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch(comando) {
		case PanelFactory.CREAR:
			
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBoton(PanelFactory.CREAR).addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBoton(PanelFactory.CREAR).setActionCommand(PanelFactory.CREAR);
	}

}
