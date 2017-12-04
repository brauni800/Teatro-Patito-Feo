package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import administradores.AdministradorObras;
import elementos.ElementoCrearFuncion;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public class EventosCrearObra extends EventosFactory {

	public EventosCrearObra(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch (comando) {
		case PanelFactory.CREAR_OBRA:
			try {
				new AdministradorObras(ventanaPrincipal.getPanelDinamico().getPanelDinamico()).crearObra();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case PanelFactory.IR_FUNCIONES:
			super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearFuncion(ventanaPrincipal));
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrear().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrear()
				.setActionCommand(PanelFactory.CREAR_OBRA);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnIrAFunciones().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnIrAFunciones()
				.setActionCommand(PanelFactory.IR_FUNCIONES);
	}

}
