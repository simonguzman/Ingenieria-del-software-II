import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import access.IVehicleRepository;
import access.RepositoryFactory;
import domain.TypeEnum;
import domain.Vehicle;
import domain.service.Service;

public class App {
    public static void main(String[] args) throws Exception {
        Vehicle veh = new Vehicle("FTK-123", TypeEnum.MOTO);
        LocalDateTime input = LocalDateTime.of(2021, Month.FEBRUARY, 22, 8, 0);
        LocalDateTime output = LocalDateTime.of(2021, Month.FEBRUARY, 22, 19, 30);
        
        IVehicleRepository repo = RepositoryFactory.getInstance().getRepository("default");
        Service service = new Service(repo); // Inyección de dependencias
        
        long result = service.calculateParkingCost(veh, input, output);
        
        System.out.println("Valor a pagar por la moto: " + result);
        service.saveVehicle(veh);
        veh = new Vehicle("JNK-124", TypeEnum.CAR);
        service.saveVehicle(veh);
        
        List<Vehicle> list = service.listVehicles();
        list.forEach(vehicle -> {
            System.out.println(vehicle.toString());
        });
            
    }
}