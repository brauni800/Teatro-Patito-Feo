package entidades.asiento;

/**
 * 
 * @author brauni800
 *
 */
public class AsientoBronce extends AsientoFactory {

	public AsientoBronce(int idFuncion, String coordenada) {
        super(idFuncion, coordenada);
        super.rango = AsientoFactory.BRONCE;
    }

    @Override
    public double getPrecio() {
        return (super.precio)*(0.6);
    }
    
}
