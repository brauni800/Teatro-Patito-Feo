package entidades;

import java.sql.Time;

public class Funcion {

	private int idFuncion;
	private int idObra;
	private long fechaFuncion;
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

	public long getFechaFuncion() {
		return fechaFuncion;
	}

	public void setFechaFuncion(long date) {
		this.fechaFuncion = date;
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
