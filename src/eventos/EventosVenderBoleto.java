package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import administradores.AdministradorBoletos;
import administradores.AdministradorFunciones;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosVenderBoleto extends EventosFactory {

	public EventosVenderBoleto(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.VENDER_BOLETOS:
			new AdministradorBoletos(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).venderBoleto();
			break;
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
