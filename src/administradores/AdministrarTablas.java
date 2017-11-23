package administradores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import bd.DAO;

public class AdministrarTablas{

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
	
	public void cargarBaseDatosFuncion(DefaultTableModel modeloFuncion) throws SQLException {
		
		//AdministrarComboBox combo = new AdministrarComboBox();
		//combo.obtenerIdObras(modelo);
		
		String[] datos = new String[6];
		Object[][] buscar = new DAO().buscar("idfuncion,idObra,fechaFuncion,inicioFuncion,finalFuncion,disponibilidadFuncion",DAO.FUNCION);
		
		for(int i = 0; i < buscar.length; i++) {
			datos[0] = buscar[i][2].toString();
			datos[1] = buscar[i][3].toString();
			datos[2] = buscar[i][4].toString();
			datos[3] = buscar[i][5].toString();
			modeloFuncion.addRow(datos);
		}
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
}
