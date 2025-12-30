public class Car extends Vehicle {
    private int doors;
    private String fuelType;

    public Car(String brand, int year, int doors, String fuelType) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Doors: " + doors + ", Fuel Type: " + fuelType);
    }

    public int getDoors() {
        return doors;
    }

    public String getFuelType() {
        return fuelType;
    }
}