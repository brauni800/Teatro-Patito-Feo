package tablas;

import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import administradores.AdministrarTablas;
import paneles.PanelFactory;

public class TablaFunciones extends JTable {

	public TablaFunciones(int idObra) {
		super();
		setModel(createModel(idObra));
		setSize(500, 340);
	}

	public DefaultTableModel createModel(int idObra) {

		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("FechaFuncion");
		modelo.addColumn("InicioFuncion");
		modelo.addColumn("FinalFuncion");
		modelo.addColumn("DisponibilidadFuncion");
		AdministrarTablas ad = new AdministrarTablas();
		try {
			ad.cargarBaseDatosFuncion(modelo, idObra);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return modelo;
	}

}
