public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with kickstart");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }

    public void displayMotorcycleInfo() {
        displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }
}