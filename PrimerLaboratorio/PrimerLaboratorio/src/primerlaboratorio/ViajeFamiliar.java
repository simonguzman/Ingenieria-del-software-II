
package primerlaboratorio;

import java.util.Date;
import java.util.logging.Logger;

public class ViajeFamiliar extends Viaje{
    /**
    * Cantidad de integrantes de la familia
    */
    private int familia;
    //Constructor getters and setters
    public ViajeFamiliar(){
        super();
    }
    
    public ViajeFamiliar(int familia, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.familia = familia;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
    
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    @Override
    public String cualquierMetodo2() {
        return "Disfrute de un buen viaje con su familia";
    }
}
