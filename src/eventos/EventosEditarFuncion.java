package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import administradores.AdministradorFunciones;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosEditarFuncion extends EventosFactory{

	public EventosEditarFuncion(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.EDITAR_FUNCION:
			try {
				new AdministradorFunciones(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).editarFuncion();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		}
	}

	@Override
	protected void initEvents() {
	}

}
