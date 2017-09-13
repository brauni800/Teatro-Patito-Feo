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
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.CREAR_OBRA).setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.ELIMINAR_OBRA).setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.EDITAR_OBRA).setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal));
				break;
			case PanelFactory.ELIMINAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.CREAR_OBRA).setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.ELIMINAR_OBRA).setEnabled(false);
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.EDITAR_OBRA).setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico()
						.setElementoDinamico(new ElementoEliminarObra(ventanaPrincipal));
				break;
			case PanelFactory.EDITAR_OBRA:
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.CREAR_OBRA).setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.ELIMINAR_OBRA).setEnabled(true);
				super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.EDITAR_OBRA).setEnabled(false);
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
		super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.REGRESAR).addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.REGRESAR)
				.setActionCommand(PanelFactory.REGRESAR);

		super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.CREAR_OBRA).addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.CREAR_OBRA)
				.setActionCommand(PanelFactory.CREAR_OBRA);

		super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.ELIMINAR_OBRA).addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.ELIMINAR_OBRA)
				.setActionCommand(PanelFactory.ELIMINAR_OBRA);

		super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.EDITAR_OBRA).addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getBoton(PanelFactory.EDITAR_OBRA)
				.setActionCommand(PanelFactory.EDITAR_OBRA);
	}

}
