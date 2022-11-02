package domain;

import java.time.Duration;
import java.time.LocalDateTime;

import infrac.Utils;

public class TruckParkingCost implements IParkingCost {

    @Override
    public long calcularCosto(LocalDateTime input, LocalDateTime output) {
        double varHoras = Duration.between(input, output).toHours();
        if (varHoras <= 12) {
            return Utils.redondearValor(valorMinimoTruck);
        } else if(varHoras <= 24){
            return Utils.redondearValor(valorTruck);
        } else{
            return Utils.redondearValor((long) (valorTruck + (((varHoras - 24) / 24) * valorAdicionalTruck)));
        }
    }  
}
