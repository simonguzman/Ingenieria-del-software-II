package domain;
import java.time.Duration;
import java.time.LocalDateTime;

import infrac.Utils;

public class MotoParkingCost implements IParkingCost {

    @Override
    public long calcularCosto(LocalDateTime input, LocalDateTime output) {
      double varHoras = Duration.between(input, output).getSeconds();
      varHoras = varHoras / 3600;
      if (varHoras < 1) {
          return Utils.redondearValor(valorMinimoMoto);
      } else{
          return Utils.redondearValor((long) (valorMoto + ((varHoras - 1)*valorAdicionalMoto)));
      }
    }
}
