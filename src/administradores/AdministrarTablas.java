package administradores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import bd.DAO;
import tablas.TablaObras;

public class AdministrarTablas extends MouseAdapter {

	private JTable tabla;
	private JButton boton;
	private Object valueObtained;
	private JTextField jTextField;

	public AdministrarTablas() {
		this.tabla = tabla;
		this.boton = boton;
		this.valueObtained = null;
		this.jTextField = null;
	}

	public Object[][] cargarBaseDatosObras() throws SQLException {
		
		DAO buscar = new DAO();	
		
		return buscar.buscar("idRepresentante, nombreObra, duracionObra, descripcionObra", DAO.FUNCION);
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		super.mousePressed(me);
		int row = this.tabla.getSelectedRow();
		this.valueObtained = this.tabla.getModel().getValueAt(row, 0);
		this.boton.setEnabled(true);
		mostrarNombreJTextField(row);
	}

	/**
	 * @return the valueObtained
	 */
	public Object getValueObtained() {
		return this.valueObtained;
	}

	private void mostrarNombreJTextField(int row) {
		if (this.jTextField != null) {
			this.jTextField.setText(this.tabla.getModel().getValueAt(row, 1).toString());
		}
	}

	public void setjTextField(JTextField jTextField) {
		this.jTextField = jTextField;
	}

}
