package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import administradores.AdministradorFunciones;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosCancelarFuncion extends EventosFactory {

	public EventosCancelarFuncion(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.CANCELAR_FUNCION:
			try {
				new AdministradorFunciones(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).cancelarFuncion();
				;
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case PanelFactory.MOSTRAR_FUNCIONES:
			new AdministradorFunciones(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).actualizarTabla();
		}

	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCancelarFuncion().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCancelarFuncion()
				.setActionCommand(PanelFactory.CANCELAR_FUNCION);

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
