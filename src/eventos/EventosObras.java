package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoAgregarRepresentante;
import elementos.ElementoEditarObra;
import elementos.ElementoEliminarObra;
import elementos.ElementoMenuPrincipal;
import vista.paneles.PanelFactory;
import vista.ventanas.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public class EventosObras extends EventosFactory {

	public EventosObras(VentanaPrincipal ventanaPrincipal) {
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
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoAgregarRepresentante(ventanaPrincipal));
				break;
			case PanelFactory.ELIMINAR:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.ACTUALIZAR:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
				break;
			}
		} catch (NullPointerException ex) {
			switch (comando) {
			case PanelFactory.CREAR:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoAgregarRepresentante(ventanaPrincipal));
				break;
			case PanelFactory.ELIMINAR:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.ACTUALIZAR:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
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
