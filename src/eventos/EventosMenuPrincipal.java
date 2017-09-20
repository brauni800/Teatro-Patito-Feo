package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoFunciones;
import elementos.ElementoObras;
import vista.paneles.PanelFactory;
import vista.ventanas.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public class EventosMenuPrincipal extends EventosFactory {

	public EventosMenuPrincipal(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch(comando) {
		case PanelFactory.OBRAS:
			super.ventanaPrincipal.setElementoDinamico(new ElementoObras(ventanaPrincipal));
			break;
		case PanelFactory.FUNCIONES:
			super.ventanaPrincipal.setElementoDinamico(new ElementoFunciones(ventanaPrincipal));
			break;
		case PanelFactory.VENDER_BOLETOS:
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getBtnObras().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnObras().setActionCommand(PanelFactory.OBRAS);
		
		super.ventanaPrincipal.getPanelDinamico().getBtnFunciones().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnFunciones().setActionCommand(PanelFactory.FUNCIONES);
	}

}
