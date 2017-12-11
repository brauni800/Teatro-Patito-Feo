package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoCancelarFuncion;
import elementos.ElementoCrearFuncion;
import elementos.ElementoEditarFuncion;
import elementos.ElementoMenuPrincipal;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosFuncion extends EventosFactory {

	public EventosFuncion(VentanaPrincipal ventanaPrincipal) {
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
			case PanelFactory.CREAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrearFuncion().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnCancelarFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoCrearFuncion(ventanaPrincipal));
				break;
			case PanelFactory.CANCELAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrearFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnCancelarFuncion().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoCancelarFuncion(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrearFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnCancelarFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoEditarFuncion(ventanaPrincipal));
				break;
			}
		} catch (NullPointerException ex) {
			switch (comando) {
			case PanelFactory.CREAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoCrearFuncion(ventanaPrincipal));
				break;
			case PanelFactory.CANCELAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoCancelarFuncion(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoEditarFuncion(ventanaPrincipal));
				break;
			}
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().setActionCommand(PanelFactory.REGRESAR);

		super.ventanaPrincipal.getPanelDinamico().getBtnCrearFuncion().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnCrearFuncion().setActionCommand(PanelFactory.CREAR_FUNCION);

		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarFuncion().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarFuncion()
				.setActionCommand(PanelFactory.CANCELAR_FUNCION);

		super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().setActionCommand(PanelFactory.EDITAR_FUNCION);
	}

}
