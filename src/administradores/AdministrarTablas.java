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

	public void cargarBaseDatosObras(DefaultTableModel modelo) throws SQLException {
		
		String[] datos = new String[5];
		
		Object[][] buscar = new DAO().buscar("idObra,nombreObra,duracionObra,descripcionObra,idRepresentante", DAO.OBRA);	
		
		for (int i = 0; i < buscar.length; i++) {
			datos[0] = buscar[i][0].toString();
			datos[1] = buscar[i][1].toString();
			datos[2] = buscar[i][2].toString();
			datos[3] = buscar[i][3].toString();
			datos[4] = buscar[i][4].toString();
			modelo.addRow(datos);
		}
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
