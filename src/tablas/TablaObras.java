package tablas;

import java.sql.SQLException;

import javax.swing.JComponent;
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

	AdministrarTablas adminTab;
	DefaultTableModel modelo;
	
	public TablaObras() throws SQLException {
		super();
		setModel(createModel());
		setSize(500, 340);
	}

	public TablaObras(int columna) throws SQLException {
		super();
		setModel(createModel(columna));
		setSize(500, 340);
		initEvents();
	}
	
	public TablaObras(int columna, JComponent[] arreglo) throws SQLException {
		super();
		setModel(createModel(columna, arreglo));
		setSize(500, 340);
		initEvents();
	}

	public void cancelarSeleccionado() throws SQLException {
		adminTab.cancelarObra();
		generarEstructura();
		adminTab.cargarObrasActivas(modelo);
		setModel(modelo);
	}

	// ****************************************************************************************
	// ****************************************************************************************
	// **************************Recursos para los metodos publicos****************************
	// ****************************************************************************************
	// ***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***

	private DefaultTableModel createModel() throws SQLException {
		generarEstructura();
		adminTab = new AdministrarTablas();
		adminTab.cargarObrasActivas(modelo);
		return modelo;
	}

	private DefaultTableModel createModel(int columna) throws SQLException {
		generarEstructura();
		adminTab = new AdministrarTablas(this, columna);
		adminTab.cargarObrasActivas(modelo);
		return modelo;
	}
	
	private DefaultTableModel createModel(int columna, JComponent[] arreglo) throws SQLException {
		generarEstructura();
		adminTab = new AdministrarTablas(this, columna, arreglo);
		adminTab.cargarObrasActivas(modelo);
		return modelo;
	}

	private void initEvents() throws SQLException {
		addMouseListener(adminTab);
	}

	private void generarEstructura()  {
		modelo = new DefaultTableModel();
		modelo.addColumn("idObra");
		modelo.addColumn("Nombre");
		modelo.addColumn("Duración");
		modelo.addColumn("Descripción");
		modelo.addColumn("Representante");
	}

}
