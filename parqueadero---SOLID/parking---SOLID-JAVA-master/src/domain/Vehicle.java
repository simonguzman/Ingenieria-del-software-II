package domain;

public class Vehicle {
    private String plate;
    private TypeEnum type;

    public Vehicle(String plate, TypeEnum type) {
        this.plate = plate;
        this.type = type;
    }

    //** SETTERS && GETTERS
    public String getPlate() { return this.plate; }
    public void setPlate(String plate) { this.plate = plate; }

    public TypeEnum getType() { return this.type; }
    public void setType(TypeEnum type) { this.type = type; }

    @Override
    public String toString() {
        return "{" +
            " plate='" + getPlate() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }
}
