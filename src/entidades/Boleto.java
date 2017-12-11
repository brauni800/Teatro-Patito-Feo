package entidades;

public class Boleto {
	private int idfuncion;
	private double precioboleto;
	private String coordenadaAsiento, Comprado;

	public Boleto() {

	}

	public int getIdfuncion() {
		return idfuncion;
	}

	public void setIdfuncion(int idfuncion) {
		this.idfuncion = idfuncion;
	}

	public double getPrecioboleto() {
		return precioboleto;
	}

	public void setPrecioboleto(double precioboleto) {
		this.precioboleto = precioboleto;
	}

	public String getCoordenadaAsiento() {
		return coordenadaAsiento;
	}

	public void setCoordenadaAsiento(String coordenadaAsiento) {
		this.coordenadaAsiento = coordenadaAsiento;
	}

	public String getComprado() {
		return Comprado;
	}

	public void setComprado(String comprado) {
		Comprado = comprado;
	}

}
