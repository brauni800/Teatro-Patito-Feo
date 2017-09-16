package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import paneles.PanelFactory;
import vista.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public class EventosEliminarObra extends EventosFactory {

	public EventosEliminarObra(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch(comando) {
		case PanelFactory.ELIMINAR:
			try {
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTable().cancelarSeleccionado();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEliminar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEliminar().setActionCommand(PanelFactory.ELIMINAR);
	}

}
