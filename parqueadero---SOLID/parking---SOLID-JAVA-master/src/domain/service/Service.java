package domain.service;

import java.time.LocalDateTime;
import java.util.List;

import access.IVehicleRepository;
import domain.ParkingCostFactory;
import domain.Vehicle;

public class Service {

    private IVehicleRepository repository;

    public Service (IVehicleRepository argRepository){
        this.repository = argRepository;
    }

    /**
     * @param vehicle
     * @param input
     * @param output
     */
    public long calculateParkingCost(Vehicle vehicle, LocalDateTime input, LocalDateTime output){
        return ParkingCostFactory.getParkingCost(vehicle.getType()).calculateCost(input, output);
    }

    /**
     * @param vehicle
     */
    public void saveVehicle(Vehicle vehicle){
        if(repository.save(vehicle)){
            System.out.println("HA INGRESADO UN CARRO!");
            return;
        }
        System.out.println("[ERROR] ingreso de carro...");
    }

    public List<Vehicle> listVehicles(){
        return repository.list(); 
    }
}