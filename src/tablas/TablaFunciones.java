package tablas;

import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import administradores.AdministrarTablas;

public class TablaFunciones extends JTable{
	
	public TablaFunciones() {
		super();
		setModel(createModel());
		setSize(500, 340);
	}

	public DefaultTableModel createModel() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("idFuncion");
		modelo.addColumn("idObra");
		modelo.addColumn("Fecha");
		modelo.addColumn("Inicio");
		modelo.addColumn("Final");
		AdministrarTablas ad = new AdministrarTablas();
		try {
			ad.cargarBaseDatosFuncion(modelo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return modelo;
	}

}