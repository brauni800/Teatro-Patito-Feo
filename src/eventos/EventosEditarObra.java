package eventos;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

import administradores.AdministradorObras;
import administradores.AdministradorRepresentante;
import entidades.Obra;
import paneles.PanelFactory;
import vista.VentanaPrincipal;

public class EventosEditarObra extends EventosFactory {

	public EventosEditarObra(VentanaPrincipal ventanaPrincipal) {
		super(ventanaPrincipal);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		switch(comando) {
		case PanelFactory.ACTUALIZAR_OBRA:
			
			break;
		case PanelFactory.EDITAR_REPRESENTANTE:
			
			break;
		case PanelFactory.SELECCIONAR:
			String item = super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxSeleccionar().getSelectedItem().toString();
			String texto = "Seleccionar obra";
			if (!texto.equals(item)) {
				String[] parse = item.split(" - ");
				try {
					Obra obraEncontrada = new AdministradorObras().buscarObraBD(Integer.parseInt(parse[0]));
					habilitarComponentes(obraEncontrada);
				} catch (NumberFormatException | SQLException e1) {
					e1.printStackTrace();
				}
			} else {
				deshabilitarComponentes();
			}
			break;
		}
	}

	@Override
	protected void initEvents() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxSeleccionar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxSeleccionar().setActionCommand(PanelFactory.SELECCIONAR);
		
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnActualizar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnActualizar().setActionCommand(PanelFactory.ACTUALIZAR_OBRA);
		
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEditar().addActionListener(this);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEditar().setActionCommand(PanelFactory.EDITAR_REPRESENTANTE);
	}
	
	@SuppressWarnings("deprecation")
	private void habilitarComponentes(Obra obraEncontrada) throws SQLException {
		String representante = String.valueOf(obraEncontrada.getIdRepresentante()) + " - " + AdministradorRepresentante.buscarNombreCompletoRepresentante(obraEncontrada.getIdRepresentante());
		
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldNombre().setText(obraEncontrada.getNombre());
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldPrecio().setText(String.valueOf(obraEncontrada.getPrecio()));
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldRepresentantes().setText(representante);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxHoras().setSelectedItem(obraEncontrada.getDuracion().getHours());
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxMinutos().setSelectedItem(obraEncontrada.getDuracion().getMinutes());
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTextAreaDescripcion().setText(obraEncontrada.getDescripcion());
		
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEditar().setVisible(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldNombre().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldPrecio().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxHoras().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxMinutos().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTextAreaDescripcion().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl1().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl2().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl3().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl4().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl5().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl6().setEnabled(true);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnActualizar().setEnabled(true);
	}
	
	private void deshabilitarComponentes() {
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldNombre().setText("");
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldPrecio().setText("");
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldRepresentantes().setText("");
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxHoras().setSelectedIndex(0);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxMinutos().setSelectedIndex(0);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTextAreaDescripcion().setText("");
		
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnEditar().setVisible(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldNombre().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTxtFieldPrecio().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxHoras().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getCmBoxMinutos().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getTextAreaDescripcion().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl1().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl2().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl3().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl4().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl5().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getLbl6().setEnabled(false);
		super.ventanaPrincipal.getPanelDinamico().getPanelDinamico().getBtnActualizar().setEnabled(false);
	}
}
