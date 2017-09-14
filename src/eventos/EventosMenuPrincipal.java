package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoObras;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

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
		case PanelFactory.VENDER_BOLETOS:
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getObras().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getObras().setActionCommand(PanelFactory.OBRAS);
	}

}
