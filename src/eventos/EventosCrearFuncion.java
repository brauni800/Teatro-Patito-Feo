package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import paneles.PanelFactory;
import administradores.AdministradorFunciones;
import vista.VentanaPrincipal;

public class EventosCrearFuncion extends EventosFactory {

	public EventosCrearFuncion(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.CREAR_FUNCION:
			try {
				new AdministradorFunciones(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).crearFuncion();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case PanelFactory.MOSTRAR_FUNCIONES:
			new AdministradorFunciones(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).actualizarTabla();
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrearFuncion().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrearFuncion()
				.setActionCommand(PanelFactory.CREAR_FUNCION);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnMostrarFunciones().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnMostrarFunciones()
				.setActionCommand(PanelFactory.MOSTRAR_FUNCIONES);

		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxSeleccionarObra()
				.addItemListener(new ItemListener() {

					@Override
					public void itemStateChanged(ItemEvent e) {
						if (e.getStateChange() == ItemEvent.SELECTED) {

						}

					}
				});
	}

}
