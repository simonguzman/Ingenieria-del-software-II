package domain;

import java.time.LocalDateTime;

public interface IParkingCost {
    static final long valorMoto = 2000;
    static final long valorMinimoMoto = 1000;
    static final long valorAdicionalMoto = 1000;
    static final long valorCar = 4000;
    static final long valorMinimoCar = 2000;
    static final long valorAdicionalCar = 2000;
    static final long valorTruck = 15000;
    static final long valorMinimoTruck = 10000;
    static final long valorAdicionalTruck = 15000;
    long calcularCosto(LocalDateTime input, LocalDateTime output);
}
