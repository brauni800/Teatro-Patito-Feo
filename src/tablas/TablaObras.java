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
@SuppressWarnings("serial")
public class TablaObras extends JTable {

	/**
	 * Constructor que inicializa la tabla.
	 */
	public TablaObras() {
		super();
		setModel(createModel());
		setSize(500, 340);
	}

	/**
	 * Método para la creación de la tabla de Obras.
	 * 
	 * @return La tabla creada con las obras.
	 */
	public DefaultTableModel createModel() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("idObra");
		modelo.addColumn("Nombre");
		modelo.addColumn("Duración");
		modelo.addColumn("Descripción");
		modelo.addColumn("Representante");
		AdministrarTablas ad = new AdministrarTablas();
		try {
			ad.cargarBaseDatosObras(modelo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return modelo;
	}

}
