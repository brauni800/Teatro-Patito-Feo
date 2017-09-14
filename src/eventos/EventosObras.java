package eventos;

import java.awt.event.ActionEvent;

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
				super.ventanaPrincipal.getPanelDinamico().getCrear().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getEliminar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getEditar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal));
				break;
			case PanelFactory.ELIMINAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().getCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getEliminar().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getEditar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().getCrear().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getEliminar().setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getEditar().setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
				break;
			}
		} catch (NullPointerException ex) {
			switch (comando) {
			case PanelFactory.CREAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal));
				break;
			case PanelFactory.ELIMINAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
				break;
			}
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getRegresar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getRegresar().setActionCommand(PanelFactory.REGRESAR);

		super.ventanaPrincipal.getPanelDinamico().getCrear().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getCrear().setActionCommand(PanelFactory.CREAR_OBRA);

		super.ventanaPrincipal.getPanelDinamico().getEliminar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getEliminar().setActionCommand(PanelFactory.ELIMINAR_OBRA);

		super.ventanaPrincipal.getPanelDinamico().getEditar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getEditar().setActionCommand(PanelFactory.EDITAR_OBRA);
	}

}
