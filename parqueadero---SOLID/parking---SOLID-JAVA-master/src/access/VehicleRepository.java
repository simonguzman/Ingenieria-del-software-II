package access;

import java.util.ArrayList;
import java.util.List;

import domain.Vehicle;

public class VehicleRepository implements IVehicleRepository {
    private List<Vehicle> vehicles;


    public VehicleRepository() {
        this.vehicles = new ArrayList<Vehicle>();
    }

    @Override
    public boolean save(Vehicle newVehicle) {
        vehicles.add(newVehicle);
        return true;
    }

    @Override
    public List<Vehicle> list() {
        return this.vehicles;
    }
    
}
