package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;

import administradores.AdministradorFunciones;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosEditarFuncion extends EventosFactory {

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
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxSeleccionarObra()
				.addItemListener(new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent e) {
						if (e.getStateChange() == ItemEvent.SELECTED) {
							System.out.println(e.getItem());
						}

					}
				});
	}
	
	

}
