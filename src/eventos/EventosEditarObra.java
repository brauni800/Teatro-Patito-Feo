package eventos;

import java.awt.event.ActionEvent;

import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosEditarObra extends EventosFactory {

	public EventosEditarObra(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch(comando) {
		case PanelFactory.CREAR_EDITAR:
			
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEditar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEditar().setActionCommand(PanelFactory.CREAR_EDITAR);
	}
}
