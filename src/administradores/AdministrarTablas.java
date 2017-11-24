package administradores;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import bd.DAO;

public class AdministrarTablas{

	public AdministrarTablas() {
	}
	
	public void cargarBaseDatosFuncion(DefaultTableModel modeloFuncion) throws SQLException {
		
		Object idObra = 1;
		String[] datos = new String[6];
		Object[][] buscar = new DAO().buscarConFiltro("fechaFuncion,inicioFuncion,finalFuncion,disponibilidadFuncion", DAO.FUNCION, "idObra", idObra);
		
		for(int i = 0; i < buscar.length; i++) {
			datos[0] = buscar[i][0].toString();
			datos[1] = buscar[i][1].toString();
			datos[2] = buscar[i][2].toString();
			datos[3] = buscar[i][3].toString();
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
