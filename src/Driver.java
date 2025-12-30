import java.util.ArrayList;
import java.util.List;

public class Driver {
    private String name;
    private String licenseNumber;
    private List<Vehicle> vehicles;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.vehicles = new ArrayList<>();
    }

    public void displayDriverInfo() {
        System.out.println("Driver: " + name + ", License: " + licenseNumber);
        System.out.println("Assigned vehicles: " + vehicles.size());

        for (Vehicle vehicle : vehicles) {
            System.out.println("  - " + vehicle.getBrand() + " (" + vehicle.getYear() + ")");
        }
    }

    public void assignVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicles.add(vehicle);
        }
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public List<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }
}
