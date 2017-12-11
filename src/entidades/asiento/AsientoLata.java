package entidades.asiento;

/**
 * 
 * @author brauni800
 *
 */
public class AsientoLata extends AsientoFactory {

	public AsientoLata(int idFuncion, String coordenada) {
		super(idFuncion, coordenada);
		super.rango = AsientoFactory.LATA;
	}

	@Override
	public double getPrecio() {
		return (super.precio) * (0.5);
	}

}
