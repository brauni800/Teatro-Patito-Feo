package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoMenuPrincipal;
import vista.paneles.PanelFactory;
import vista.ventanas.VentanaPrincipal;

public class EventosFunciones extends EventosFactory {

	public EventosFunciones(VentanaPrincipal ventanaPrincipal) {
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
			case PanelFactory.CREAR:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(true);
				break;
			case PanelFactory.ELIMINAR:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(true);
				break;
			case PanelFactory.ACTUALIZAR:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(false);
				break;
			}
		} catch (NullPointerException ex) {
			switch (comando) {
			case PanelFactory.CREAR:
				
				break;
			case PanelFactory.ELIMINAR:
				
				break;
			case PanelFactory.ACTUALIZAR:
				
				break;
			}
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().setActionCommand(PanelFactory.REGRESAR);

		super.ventanaPrincipal.getPanelDinamico().getBtnCrear().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setActionCommand(PanelFactory.CREAR);

		super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setActionCommand(PanelFactory.ELIMINAR);

		super.ventanaPrincipal.getPanelDinamico().getBtnEditar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setActionCommand(PanelFactory.ACTUALIZAR);
	}

}
