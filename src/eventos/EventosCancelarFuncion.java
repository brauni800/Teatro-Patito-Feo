package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import administradores.AdministradorObras;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosCancelarFuncion extends EventosFactory{

	public EventosCancelarFuncion(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.CANCELAR_FUNCION:
			try {
				new AdministradorObras(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).crearObra();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		}
		
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrear().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrear()
				.setActionCommand(PanelFactory.CANCELAR_FUNCION);
	}
		
	}
	
