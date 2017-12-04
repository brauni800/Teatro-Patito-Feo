package eventos;

import java.awt.event.ActionEvent;

import elementos.ElementoAgregarResponsable;
import elementos.ElementoCrearObra;
import elementos.ElementoEditarObra;
import elementos.ElementoEliminarObra;
import elementos.ElementoMenuPrincipal;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

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
			case PanelFactory.CREAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnAgregarResponsable().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal));
				break;
			case PanelFactory.ELIMINAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnAgregarResponsable().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBtnAgregarResponsable().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
				break;
			case PanelFactory.AGREGAR_RESPONSABLE:
				super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBtnAgregarResponsable().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoAgregarResponsable(ventanaPrincipal));
				break;
			}
		} catch (NullPointerException ex) {
			switch (comando) {
			case PanelFactory.CREAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal));
				break;
			case PanelFactory.ELIMINAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
				break;
			case PanelFactory.AGREGAR_RESPONSABLE:
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoAgregarResponsable(ventanaPrincipal));
			}
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnRegresar().setActionCommand(PanelFactory.REGRESAR);

		super.ventanaPrincipal.getPanelDinamico().getBtnCrear().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnCrear().setActionCommand(PanelFactory.CREAR_OBRA);

		super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnEliminar().setActionCommand(PanelFactory.ELIMINAR_OBRA);

		super.ventanaPrincipal.getPanelDinamico().getBtnEditar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnEditar().setActionCommand(PanelFactory.EDITAR_OBRA);

		super.ventanaPrincipal.getPanelDinamico().getBtnAgregarResponsable().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBtnAgregarResponsable()
				.setActionCommand(PanelFactory.AGREGAR_RESPONSABLE);
	}

}
