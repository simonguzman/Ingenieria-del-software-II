
package primerlaboratorio;

import java.util.Date;

public class ViajeIncentivo extends Viaje{
    /**
    * Empresa que patrocina el viaje al empleado
    */
    private String empresa;
    //Constructor, getters and setters

    public ViajeIncentivo(){
        super();
    }
    
    public ViajeIncentivo(String empresa, String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }
    public String cualquierMetodo2() {
        return "Disfrute de su merecido viaje por su esfuerzo";
    }
}
