package domain;

import java.time.Duration;
import java.time.LocalDateTime;

import infrac.Utils;

public class CarParkingCost implements IParkingCost {
    
    @Override
    public long calculateCost(LocalDateTime input, LocalDateTime output) {
        double varDuracionHoras = Duration.between(input, output).getSeconds();
        varDuracionHoras = varDuracionHoras / 3600;
        if (varDuracionHoras < 1) {
            return Utils.redondear(valorMinCar);
        } else{
            return Utils.redondear((long) (valorFijoCar + ((varDuracionHoras - 1)*valorAdicionCar)));
        }
    }
    
}