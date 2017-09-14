package entidades.asiento;

/**
 * 
 * @author brauni800
 *
 */
public class AsientoOro extends AsientoFactory {
    
    public AsientoOro(int idFuncion, String coordenada) {
        super(idFuncion, coordenada);
        super.rango = AsientoFactory.ORO;
    }

    @Override
    public double getPrecio() {
        return (super.precio)*(0.9);
    }
    
}
