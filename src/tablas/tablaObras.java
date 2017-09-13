package tablas;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author b1796
 *
 */
public class tablaObras extends JTable {

	public tablaObras() {
		super();
		setModel(createModel());
		setSize(500, 340);
	}
	
	private DefaultTableModel createModel() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("ID Obra");
		modelo.addColumn("Nombre");
		modelo.addColumn("Duración");
		return modelo;
	}
	
}
