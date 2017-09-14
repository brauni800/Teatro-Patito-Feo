package entidades.asiento;

/**
 * 
 * @author brauni800
 *
 */
public class AsientoPlata extends AsientoFactory {
    
    public AsientoPlata(int idFuncion, String coordenada) {
        super(idFuncion, coordenada);
        super.rango = AsientoFactory.PLATA;
    }

    @Override
    public double getPrecio() {
        return (super.precio)*(0.75);
    }
    
}
