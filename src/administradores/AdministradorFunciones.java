package administradores;

import java.sql.SQLException;
import java.sql.Time;
import javax.swing.JOptionPane;
import bd.DAO;
import entidades.Funcion;
import paneles.PanelFactory;

public class AdministradorFunciones {

	public static final String ESTADO_ACTIVO = "ACTIVO";
	public static final String ESTADO_CANCELADO = "CANCELADO";
	private boolean validacionDatos;

	private PanelFactory panel;
	private Funcion funcion;

	public AdministradorFunciones(PanelFactory panel) {
		super();
		this.panel = panel;
		this.validacionDatos =  false;
	}

	public void crearFuncion() throws SQLException {
		crearEntidadFuncion();
		insertarFuncionBD();
	}
	
	public void editarFuncion() throws SQLException {
		crearEntidadFuncion();
		editarFuncionBD();
	}
	
	public void  cancelarFuncion() throws SQLException {
		crearEntidadFuncion();
		cancelarFuncionBD();
	}
	
	private void cancelarFuncionBD() throws SQLException {
		
		DAO cancelar = new DAO();
		cancelar.crearEstructuraParaActualizar(DAO.FUNCION, "disponiblidadFuncion", ESTADO_CANCELADO);
		cancelar.crearEstructuraParaActualizar(DAO.FUNCION, "inicioFuncion, finalFuncion", new Time(0));
	}
	
	private void editarFuncionBD() throws SQLException{
		
        DAO editar = new DAO();
        
        int columna = obtenerColumnaEditada();
        int fila = obtenerFilaEditada();
        //Object nuevoValor = panel.getTableFunciones().getValueAt(fila, columna);
        
        //editar.crearEstructuraParaActualizar(DAO.FUNCION, panel.getTableFunciones().getColumnName(columna), nuevoValor);
        if(this.validacionDatos == true){
        if (validarHorarios() == false) {
            int reply = JOptionPane.showConfirmDialog(null, "�Est� seguro que desea actualizar esta funcion?", "Actualizar Funcion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (reply == JOptionPane.YES_OPTION) {
                editar.confirmar();
                JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ya existe una funci�n a esa hora");
        }
        }
		
	}
	
	private void insertarFuncionBD() throws SQLException {
		DAO insertar = new DAO();
		insertar.crearEstructuraParaInsertar(DAO.FUNCION, "idfuncion, idObra, fechaFuncion, inicioFuncion, finalFuncion, disponibilidadFuncion");
		insertar.insertarInt(1, this.funcion.getIdFuncion());
		insertar.insertarInt(2, this.funcion.getIdObra());
		insertar.insertarDate(3, this.funcion.getFechaFuncion());
		insertar.insertarTime(4, inicioFuncion());
		insertar.insertarTime(5, finalFuncion());
		insertar.insertarString(6, this.funcion.getDisponiblidadFuncion());
		
		if(this.validacionDatos = false) {
		if(validarHorarios() == false) {
			int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea registrar esta obra?", "Registrar obra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	        if (reply == JOptionPane.YES_OPTION) {
	            insertar.confirmar();
	            JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
	        }
		}else {
			JOptionPane.showMessageDialog(null, "Ya existe una función a esa hora");
		}	
		}
	}
	
	private boolean validarHorarios() throws SQLException {
		Object[][] buscar = new DAO().buscar("fechaFuncion,inicioFuncion,finalFuncion",DAO.FUNCION);
		java.sql.Date date = new java.sql.Date(this.funcion.getFechaFuncion());
		for(int i = 0; i<buscar.length; i++) {	
			
			String tiempo[] = buscar[i][1].toString().split(":");
			int horaInicio = Integer.parseInt(tiempo[0]);
			int minutosInicio = Integer.parseInt(tiempo[1]);
			Time iniciodato = new Time(((horaInicio*3600000) + (minutosInicio*60000)) - 64800000);
			
			int horaFinal = Integer.parseInt(tiempo[0]);
			int minutosFinal = Integer.parseInt(tiempo[1]);
			Time finalDato = new Time(((horaFinal*3600000) + (minutosFinal*60000)) - 64800000);
			
			if((date.toString()).equals(buscar[i][0].toString())
					&& this.funcion.getInicioFuncion().getTime() >= iniciodato.getTime()
					&& this.funcion.getFinalFuncion().getTime() <= finalDato.getTime()){
				return true;
			}
		}
		return false;
	}
	
	private void crearEntidadFuncion() throws SQLException {	
		try {
		this.funcion = new Funcion();
		this.funcion.setIdObra(obtenerIDObra());
		this.funcion.setInicioFuncion(inicioFuncion());
		this.funcion.setFinalFuncion(finalFuncion());
		this.funcion.setFechaFuncion(panel.getCalendario().getDate().getTime());
		this.funcion.setDisponiblidadFuncion(ESTADO_ACTIVO);
		this.validacionDatos = true;
		}catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Falta algún dato");	
		}
	}
	
	
	private Time inicioFuncion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		return new Time(((horas*3600000) + (minutos*60000)) - 64800000);
	}
	
	private Time finalFuncion() {
		int horas = (Integer) this.panel.getCmBoxHoras().getSelectedItem();
		int minutos = (Integer) this.panel.getCmBoxMinutos().getSelectedItem();
		return new Time(((horas*3600000) + (minutos*60000)) - 64800000);
	}
	
	public int obtenerIDObra() {
		String item = panel.getCmBoxSeleccionarObra().getSelectedItem().toString();
		String[] idObra = item.split(" ");
		return Integer.parseInt(idObra[0]);
	}
	
    public int obtenerColumnaEditada(){        
        int row = panel.getTableFunciones().getRowCount();
        int column = panel.getTableFunciones().getColumnCount();
        int columnEdit = 0;
        int rowEdit = 0;
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                columnEdit = panel.getTableFunciones().getEditingColumn();
                rowEdit = panel.getTableFunciones().getEditingRow();
                return columnEdit;
            }
        }
        return 0;
    }
	
    public int obtenerFilaEditada(){
    	
        int row = panel.getTableFunciones().getRowCount();
        int column = panel.getTableFunciones().getColumnCount();
        
        int columnEdit = 0;
        int rowEdit = 0;
        
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                columnEdit = panel.getTableFunciones().getEditingColumn();
                rowEdit = panel.getTableFunciones().getEditingRow();
                return rowEdit;
            }
        }
        return  0;
    }
}
