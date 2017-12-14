package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import administradores.AdministradorBoletos;
import administradores.AdministrarAsientos;
import elementos.ElementoVerSala;
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
			super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
			super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoVerSala(ventanaPrincipal));
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
				.setActionCommand(PanelFactory.VENDER_BOLETOS);

		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnMostrarFunciones().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnMostrarFunciones()
				.setActionCommand(PanelFactory.MOSTRAR_FUNCIONES);

		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxSeleccionarObra()
				.addItemListener(new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent e) {
						if (e.getStateChange() == ItemEvent.SELECTED) {
						}

					}
				});

	}

}
