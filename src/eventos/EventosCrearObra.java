package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import administradores.AdministradorObras;
import administradores.AdministradorRepresentante;
import elementos.ElementoAgregarRepresentante;
import elementos.ElementoCrearObra;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public class EventosCrearObra extends EventosFactory {

	private String emailRepresentante;

	public EventosCrearObra(VentanaPrincipal ventanaPrincipal, String emailRepresentante) {
		super(ventanaPrincipal);
		this.emailRepresentante = emailRepresentante;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		try {
			switch (comando) {
			case PanelFactory.CREAR_OBRA:
				AdministradorObras admin = new AdministradorObras(ventanaPrincipal.getPanelDinamico().getPanelDinamico());
				admin.setEmailRepresentante(this.emailRepresentante);
				boolean obraCreada = admin.crearObra();
				if (obraCreada) {
					super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
					super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoAgregarRepresentante(ventanaPrincipal));
				} else {
					JOptionPane.showMessageDialog(null, "Hay un campo obligatorio sin llenar", "", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case PanelFactory.ANTERIOR:
				new AdministradorRepresentante(emailRepresentante).eliminarRepresentante();
				super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
				super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoAgregarRepresentante(ventanaPrincipal));
				break;
			}
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "El nombre de esta obra ya existe", "", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrear().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnCrear()
				.setActionCommand(PanelFactory.CREAR_OBRA);

		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnAnterior().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnAnterior()
				.setActionCommand(PanelFactory.ANTERIOR);
	}

}
