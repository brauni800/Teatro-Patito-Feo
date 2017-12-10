package tablas;

import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import administradores.AdministrarTablas;

@SuppressWarnings("serial")
public class TablaFunciones extends JTable {

	/**
	 * Inicialización de la tabla de funciones.
	 * 
	 * @param idObra
	 *            Identificador de la obra que se mostrará en la tabla.
	 */
	public TablaFunciones(int idObra) {
		super();
		setModel(createModel(idObra));
		setSize(500, 340);
	}

	/**
	 * Creación del modelo tabla
	 * 
	 * @param idObra
	 *            Identificador de la obra que se mostrará en la tabla.
	 * @return Retorna la tabla creada.
	 */
	public DefaultTableModel createModel(int idObra) {

		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("ID");
		modelo.addColumn("Fecha");
		modelo.addColumn("Inicio");
		modelo.addColumn("Final");
		modelo.addColumn("Disponibilidad");
		AdministrarTablas ad = new AdministrarTablas();
		try {
			ad.cargarBaseDatosFuncion(modelo, idObra);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return modelo;
	}

}
