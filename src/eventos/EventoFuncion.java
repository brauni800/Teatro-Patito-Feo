package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoCrearObra;
import elementos.ElementoEditarObra;
import elementos.ElementoEliminarObra;
import elementos.ElementoMenuPrincipal;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventoFuncion extends EventosFactory{
	
	public EventoFuncion(VentanaPrincipal ventanaPrincipal) {
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
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal));
				break;
			case PanelFactory.CANCELAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrearFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnCancelarFuncion().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrearFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnCancelarFuncion().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
				break;
			}
		} catch (NullPointerException ex) {
			switch (comando) {
			case PanelFactory.CREAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal));
				break;
			case PanelFactory.CANCELAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_FUNCION:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
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
		super.ventanaPrincipal.getPanelDinamico().getBtnCancelarFuncion().setActionCommand(PanelFactory.CANCELAR_FUNCION);

		super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnEditarFuncion().setActionCommand(PanelFactory.EDITAR_FUNCION);
	}
	
}
