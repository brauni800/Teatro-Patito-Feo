package entidades;

public class Funcion {

	private String nombre;
    private int horaInicio;
    private int minutoInicio;
    private int horaDuracion;
    private int minutoDuracion;
    private double precioPorAsiento;

	public Funcion() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getMinutoInicio() {
		return minutoInicio;
	}

	public void setMinutoInicio(int minutoInicio) {
		this.minutoInicio = minutoInicio;
	}

	public int getHoraDuracion() {
		return horaDuracion;
	}

	public void setHoraDuracion(int horaDuracion) {
		this.horaDuracion = horaDuracion;
	}

	public int getMinutoDuracion() {
		return minutoDuracion;
	}

	public void setMinutoDuracion(int minutoDuracion) {
		this.minutoDuracion = minutoDuracion;
	}

	public double getPrecioPorAsiento() {
		return precioPorAsiento;
	}

	public void setPrecioPorAsiento(double precioPorAsiento) {
		this.precioPorAsiento = precioPorAsiento;
	}
}
