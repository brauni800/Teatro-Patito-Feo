package tablas;

import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import administradores.AdministrarTablas;

/**
 * 
 * @author b1796
 *
 */
public class TablaObras extends JTable {

	public TablaObras() {
		super();
		setModel(createModel());
		setSize(500, 340);
	}

	public DefaultTableModel createModel() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Duración");
		modelo.addColumn("Descripción");
		modelo.addColumn("Representante");	
		
		return modelo;
	}

}
