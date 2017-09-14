package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import administradores.AdministradorObras;
import administradores.AdministradorRepresentante;
import elementos.ElementoAgregarRepresentante;
import elementos.ElementoCrearObra;
import entidades.Representante;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

/**
 * 
 * @author b1796
 *
 */
public class EventosCrearObra extends EventosFactory {

	private Representante representante;

	public EventosCrearObra(VentanaPrincipal ventanaPrincipal, Representante representante) {
		super(ventanaPrincipal);
		this.representante = representante;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		try {
			switch (comando) {
			case PanelFactory.CREAR_OBRA:
				AdministradorRepresentante representante = new AdministradorRepresentante(this.representante);
				representante.insertarRepresentanteBD();
				AdministradorObras admin = new AdministradorObras(ventanaPrincipal.getPanelDinamico().getPanelDinamico());
				boolean obraCreada = admin.crearObra(this.representante.getEmail());
				if (obraCreada) {
					super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
					super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoAgregarRepresentante(ventanaPrincipal));
				} else {
					representante.eliminarRepresentante(this.representante.getEmail());
					JOptionPane.showMessageDialog(null, "Hay un campo obligatorio sin llenar", "", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case PanelFactory.ANTERIOR:
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
