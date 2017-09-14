package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import administradores.AdministradorRepresentante;
import elementos.ElementoCrearObra;
import entidades.Representante;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosAgregarRepresentante extends EventosFactory {

	public EventosAgregarRepresentante(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		switch (comando) {
		case PanelFactory.SIGUIENTE:
			Representante representante = new AdministradorRepresentante(super.ventanaPrincipal.getPanelDinamico().getPanelDinamico()).crearEntidadRepresentante();
			if (representante != null) {
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoCrearObra(ventanaPrincipal, representante));
			} else {
				JOptionPane.showMessageDialog(null, "Hay un campo obligatorio sin llenar", "", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		}

	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnSiguiente().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnSiguiente()
				.setActionCommand(PanelFactory.SIGUIENTE);
	}

}
