package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import administradores.AdministradorResponsables;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosAgregarResponsable extends EventosFactory {

	public EventosAgregarResponsable(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.AGREGAR_RESPONSABLE:
			try {
				new AdministradorResponsables(ventanaPrincipal.getPanelDinamico().getPanelDinamico())
						.crearResponsable();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		}

	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnAgregarResponsable().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnAgregarResponsable()
				.setActionCommand(PanelFactory.AGREGAR_RESPONSABLE);

	}

}
