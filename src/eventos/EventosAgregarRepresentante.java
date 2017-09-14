package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import administradores.AdministradorRepresentante;
import elementos.ElementoCrearObra;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosAgregarRepresentante extends EventosFactory {

	public EventosAgregarRepresentante(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		try {
			switch (comando) {
			case PanelFactory.SIGUIENTE:
				boolean representanteCreado = new AdministradorRepresentante(super.ventanaPrincipal.getPanelDinamico().getPanelDinamico()).crearRepresentante();
				if (representanteCreado) {
					String email = "\"" + super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldCorreoElectronico().getText() + "\"";
					super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
					super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal, email));
				} else {
					JOptionPane.showMessageDialog(null, "Hay un campo obligatorio sin llenar", "", JOptionPane.INFORMATION_MESSAGE);
				}

				break;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnSiguiente().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnSiguiente()
				.setActionCommand(PanelFactory.SIGUIENTE);
	}

}
