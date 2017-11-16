package entidades;

import java.sql.Time;
import java.util.Date;

public class Funcion {
	
	private int idFuncion;
    private Obra idObra;
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

	public Obra getIdObra() {
		return idObra;
	}

	public void setIdObra(Obra idObra) {
		this.idObra = idObra;
	}

	public Date getFechaFuncion() {
		return fechaFuncion;
	}

	public void setFechaFuncion(Date fechaFuncion) {
		this.fechaFuncion = fechaFuncion;
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
