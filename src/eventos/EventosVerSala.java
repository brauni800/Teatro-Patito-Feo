package eventos;

import java.awt.event.ActionEvent;

import administradores.AdministradorBoletos;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosVerSala extends EventosFactory{

	public EventosVerSala(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.VER_SALA:
			new AdministradorBoletos(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).verSala();
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().setActionCommand(PanelFactory.REGRESAR);

		super.ventanaPrincipal.getPanelDinamico().getBtnVenderBoleto().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnVenderBoleto().setActionCommand(PanelFactory.VENDER_BOLETOS);

		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarBoleto().setActionCommand(PanelFactory.CANCELAR_BOLETO);

		super.ventanaPrincipal.getPanelDinamico().getBtnVerSala().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnVerSala().setActionCommand(PanelFactory.VER_SALA);
		
	}

}