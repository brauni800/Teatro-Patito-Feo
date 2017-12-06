package eventos;

import java.awt.event.ActionEvent;
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
		case PanelFactory.MOSTRAR_FUNCIONES:
			new AdministradorBoletos(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).actualizarTabla();
			break;
		}
	}

	@Override
	protected void initEvents() {
		
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnVenderAsientos().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnVenderAsientos()
			.setActionCommand(PanelFactory.VENDER_ASIENTOS);

		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnMostrarFunciones().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnMostrarFunciones()
				.setActionCommand(PanelFactory.MOSTRAR_FUNCIONES);


	}

}
