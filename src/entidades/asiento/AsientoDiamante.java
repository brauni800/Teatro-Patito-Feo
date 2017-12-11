package entidades.asiento;

/**
 * 
 * @author brauni800
 *
 */
public class AsientoDiamante extends AsientoFactory {

	public AsientoDiamante(int idFuncion, String coordenada) {
		super(idFuncion, coordenada);
		super.rango = AsientoFactory.DIAMANTE;
	}

	@Override
	public double getPrecio() {
		return super.precio;
	}

}
