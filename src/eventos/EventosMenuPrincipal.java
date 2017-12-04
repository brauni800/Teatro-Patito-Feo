package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoBoleto;
import elementos.ElementoFuncion;
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
		case PanelFactory.FUNCION:
			super.ventanaPrincipal.setElementoDinamico(new ElementoFuncion(ventanaPrincipal));
			break;
		case PanelFactory.BOLETOS:
			super.ventanaPrincipal.setElementoDinamico(new ElementoBoleto(ventanaPrincipal));
			break;	
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getBtnObras().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnObras().setActionCommand(PanelFactory.OBRAS);
		
		super.ventanaPrincipal.getPanelDinamico().getBtnFuncion().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnFuncion().setActionCommand(PanelFactory.FUNCION);
		
		super.ventanaPrincipal.getPanelDinamico().getBtnBoleto().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnBoleto().setActionCommand(PanelFactory.BOLETOS);
		
	}

}
