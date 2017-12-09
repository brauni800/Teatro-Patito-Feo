package administradores;


import javax.swing.JTable;

import paneles.PanelFactory;
import tablas.TablaFunciones;

/**
 * 
 * @author ArmandoCarvajal
 *
 */
public class AdministradorBoletos {
	
	private PanelFactory panel;

	public AdministradorBoletos(PanelFactory panel) {
		super();
		this.panel = panel;
	}

	public void venderBoleto() {
		int i = panel.getPanelDinamico().getTableFunciones().getSelectedRow();
		System.out.println(i);
		
	}

	public void verSala() {
		System.out.println("ver Sala");
		
		
	}

	public void cancelarBoleto() {
		System.out.println("Cancelar");
		
	}
	
	public int obtenerIDObra() {
		String item = panel.getCmBoxSeleccionarObra().getSelectedItem().toString();
		String[] idObra = item.split(" ");
		return Integer.parseInt(idObra[0]);
	}
	
	public void actualizarTabla() {
		JTable table = new TablaFunciones(obtenerIDObra());
		this.panel.setTableFunciones(table);
		table.setVisible(true);
		this.panel.getScrollPane().setViewportView(table);
	}
	
}
