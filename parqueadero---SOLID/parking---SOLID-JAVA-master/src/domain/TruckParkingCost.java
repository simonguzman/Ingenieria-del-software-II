package domain;

import java.time.Duration;
import java.time.LocalDateTime;

import infrac.Utils;

public class TruckParkingCost implements IParkingCost {

    @Override
    public long calculateCost(LocalDateTime input, LocalDateTime output) {
        double varDuracionHoras = Duration.between(input, output).toHours();
        if (varDuracionHoras <= 12) {
            return Utils.redondear(valorMinTruck);
        } else if(varDuracionHoras <= 24){
            return Utils.redondear(valorFijoTruck);
        } else{
            return Utils.redondear((long) (valorFijoTruck + (((varDuracionHoras - 24) / 24) * valorAdicionTruck)));
        }
    }  
}
