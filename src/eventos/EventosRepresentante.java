package eventos;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import administradores.AdministradorRepresentante;
import elementos.ElementoCrearObra;
import elementos.ElementoEditarObra;
import entidades.Representante;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosRepresentante extends EventosFactory {

	public EventosRepresentante(VentanaPrincipal ventanaPrincipal) {
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
		case PanelFactory.ACTUALIZAR:
			
			break;
		case PanelFactory.ANTERIOR:
			super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().setVisible(false);
			super.ventanaPrincipal.getPanelDinamico().setElementoDinamico(new ElementoEditarObra(ventanaPrincipal));
			break;
		}

	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnSiguiente().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnSiguiente().setActionCommand(PanelFactory.SIGUIENTE);
		
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnActualizar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnActualizar().setActionCommand(PanelFactory.ACTUALIZAR);
		
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnAnterior().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnAnterior().setActionCommand(PanelFactory.ANTERIOR);
	}

}
