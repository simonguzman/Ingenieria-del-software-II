package access;

import java.util.List;

import domain.Vehicle;

public interface IVehicleRepository{
    /**
     * @param newVehicle nuevo vehiculo guardado dentro del parqueadero
     * @return verdedaro si se pudo guardar 
     */
    boolean save(Vehicle newVehicle);

    /**
     * @return Lista de vehiculos dentro del parqueadero
     */
    List<Vehicle> list();
}