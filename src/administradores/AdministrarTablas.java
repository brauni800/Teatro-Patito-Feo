package administradores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import bd.DAO;

public class AdministrarTablas extends MouseAdapter {

	public static final boolean ACTIVADO = true;
	public static final boolean DESACTIVADO = false;
	
	private final String columnasTabla = "idObra,nombreObra,duracionObra,descripcionObra,idRepresentante";
	private JTable tabla;
	private Object valueObtained;
	private int columna;
	private boolean enableJComponent;
	private JComponent[] arregloComponentes;

	/**
	 * Constructor para los metodos que no requieran MouseListener.
	 * @param columna 
	 */
	public AdministrarTablas() {
		this.tabla = null;
		this.columna = 0;
		this.enableJComponent = AdministrarTablas.DESACTIVADO;
		this.arregloComponentes = null;
	}

	/**
	 * Constructor para los eventos MouseClicked para obtener el valor de la columna a la que fue clickeada.
	 * @param tabla - Tabla con la que se interactua.
	 * @param columna - Numero de columna que se desea recuperar de la fila clickeada.
	 */
	public AdministrarTablas(JTable tabla, int columna) {
		this.tabla = tabla;
		this.columna = columna;
		this.enableJComponent = AdministrarTablas.DESACTIVADO;
		this.arregloComponentes = null;
	}

	/**
	 * Constructor para los eventos MouseClicked para obtener el valor de la columna a la que fue clickeada y habilitar componentes de la interfaz grafica.
	 * @param tabla - Tabla con la que se interactua.
	 * @param columna - Numero de columna que se desea recuperar de la fila clickeada.
	 * @param arregloComponentes - Arreglo de componentes que deben contener todos los objetos de tipo JComponent que se desean habilitar al interactuar con la tabla.
	 */
	public AdministrarTablas(JTable tabla, int columna, JComponent[] arregloComponentes) {
		this.tabla = tabla;
		this.columna = columna;
		this.enableJComponent = AdministrarTablas.ACTIVADO;
		this.arregloComponentes = arregloComponentes;
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		super.mousePressed(me);
		int row = this.tabla.getSelectedRow();
		this.valueObtained = this.tabla.getModel().getValueAt(row, this.columna);
		enableJComponent(this.enableJComponent);
	}
	
	public void cargarObrasActivas(DefaultTableModel modelo) throws SQLException {
		String[] datos = new String[5];
		String what = "\"" + AdministradorObras.ESTADO_ACTIVO + "\"";
		Object[][] buscar = new DAO().buscarConFiltro(columnasTabla, DAO.OBRA, "estado", what);
		generarModelo(datos, buscar, modelo);
	}

	public void cancelarObra() throws SQLException {
		DAO actualizar = new DAO();
		String setWhat = "\"" + AdministradorObras.ESTADO_CANCELADO + "\"";
		actualizar.crearEstructuraParaActualizar(DAO.OBRA, "estado", setWhat, "idObra", valueObtained);
		int reply = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cancelar esta obra?", "Cancelar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (reply == JOptionPane.YES_OPTION) {
        	actualizar.confirmar();
            JOptionPane.showMessageDialog(null, "Obra cancelada correctamente", "", JOptionPane.INFORMATION_MESSAGE);
        }
	}

	// ****************************************************************************************
	// ****************************************************************************************
	// **************************Recursos para los metodos publicos****************************
	// ****************************************************************************************
	// ***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***\/***

	private void generarModelo(String[] datos, Object[][] buscar, DefaultTableModel modelo) {
		for (int i = 0; i < buscar.length; i++) {
			datos[0] = buscar[i][0].toString();
			datos[1] = buscar[i][1].toString();
			datos[2] = buscar[i][2].toString();
			datos[3] = buscar[i][3].toString();
			datos[4] = buscar[i][4].toString();
			modelo.addRow(datos);
		}
	}

	private void enableJComponent(boolean estado) {
		if (estado) {
			for(int i = 0; i < this.arregloComponentes.length; i++) {
				this.arregloComponentes[i].setEnabled(true);
			}
		}
	}

}
