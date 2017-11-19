package entidades;

import java.sql.Time;
import java.sql.Date;

public class Funcion {
	
	private int idFuncion;
    private int idObra;
    private Date fechaFuncion;
    private Time inicioFuncion;
    private Time finalFuncion;
    private String disponiblidadFuncion;

	public Funcion() {
	}

	public int getIdFuncion() {
		return idFuncion;
	}

	public void setIdFuncion(int idFuncion) {
		this.idFuncion = idFuncion;
	}

	public int getIdObra() {
		return idObra;
	}

	public void setIdObra(int idObra) {
		this.idObra = idObra;
	}

	public Date getFechaFuncion() {
		return fechaFuncion;
	}

	public void setFechaFuncion(java.util.Date date) {
		date = new java.util.Date();
		java.sql.Date fecha = new java.sql.Date(date.getTime());
		this.fechaFuncion = fecha;
	}

	public Time getInicioFuncion() {
		return inicioFuncion;
	}

	public void setInicioFuncion(Time inicioFuncion) {
		this.inicioFuncion = inicioFuncion;
	}

	public Time getFinalFuncion() {
		return finalFuncion;
	}

	public void setFinalFuncion(Time finalFuncion) {
		this.finalFuncion = finalFuncion;
	}

	public String getDisponiblidadFuncion() {
		return disponiblidadFuncion;
	}

	public void setDisponiblidadFuncion(String disponiblidadFuncion) {
		this.disponiblidadFuncion = disponiblidadFuncion;
	}

	

}
