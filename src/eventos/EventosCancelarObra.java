package eventos;

import java.awt.event.ActionEvent;

import bd.DAO;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public class EventosCancelarObra extends EventosFactory {

	public EventosCancelarObra(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		DAO cancelar = new DAO();
		switch(comando) {
		case PanelFactory.ELIMINAR:
			
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEliminar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEliminar().setActionCommand(PanelFactory.ELIMINAR);
	}
	
	
	

}
