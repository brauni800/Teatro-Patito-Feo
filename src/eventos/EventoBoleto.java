package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoCancelarBoleto;
import elementos.ElementoCancelarFuncion;
import elementos.ElementoCrearFuncion;
import elementos.ElementoEditarFuncion;
import elementos.ElementoMenuPrincipal;
import elementos.ElementoVenderBoletos;
import elementos.ElementoVerSala;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
public class EventoBoleto extends EventosFactory {

	public EventoBoleto(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		try {
			switch (comando) {
			case PanelFactory.REGRESAR:
				super.ventanaPrincipal.setElementoDinamico(new ElementoMenuPrincipal(ventanaPrincipal));
				break;
			case PanelFactory.VENDER_BOLETOS:
				super.ventanaPrincipal.getPanelDinamico().getBtnVenderBoletos().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnVerSala().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoVenderBoletos(ventanaPrincipal));
				break;
			case PanelFactory.CANCELAR_BOLETO:
				super.ventanaPrincipal.getPanelDinamico().getBtnVenderBoletos().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnVerSala().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCancelarBoleto(ventanaPrincipal));
				break;
			case PanelFactory.VER_SALA:
				super.ventanaPrincipal.getPanelDinamico().getBtnVenderBoletos().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnVerSala().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoVerSala(ventanaPrincipal));
				break;
			}
		
	}catch (NullPointerException ex) {
		switch (comando) {
		case PanelFactory.VENDER_BOLETOS:
			super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoVenderBoletos(ventanaPrincipal));
			break;
		case PanelFactory.CANCELAR_BOLETO:
			super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCancelarBoleto(ventanaPrincipal));
			break;
		case PanelFactory.VER_SALA:
			super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoVerSala(ventanaPrincipal));
			break;
		}
	}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().setActionCommand(PanelFactory.REGRESAR);

		super.ventanaPrincipal.getPanelDinamico().getBtnComprarBoleto().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnComprarBoleto().setActionCommand(PanelFactory.COMPRAR_BOLETO);

		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().setActionCommand(PanelFactory.CANCELAR_BOLETO);

		super.ventanaPrincipal.getPanelDinamico().getBtnVerSala().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnVerSala().setActionCommand(PanelFactory.VER_SALA);
		
	}

}
