package access;

public class RepositoryFactory{
    private static RepositoryFactory instance;
    
    public RepositoryFactory(){
        if(RepositoryFactory.instance == null){
            RepositoryFactory.instance = this;
        }
    }

    public IVehicleRepository getRepository(String type){
        return new VehicleRepository();
    }

    public static RepositoryFactory getInstance() { 
        if(RepositoryFactory.instance == null){
            RepositoryFactory.instance = new RepositoryFactory();
        }
        return RepositoryFactory.instance; 
    }
}