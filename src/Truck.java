public class Truck extends Vehicle {
    private double capacity;
    private int numAxles;

    public Truck(String brand, int year, double capacity, int numAxles) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started with air brake release");
    }

    @Override
    public void stopEngine() {
        System.out.println("Truck engine stopped");
    }

    public void displayTruckInfo() {
        displayInfo();
        System.out.println("Capacity: " + capacity + " tons, Axles: " + numAxles);
    }

    public double getCapacity() {
        return capacity;
    }

    public int getNumAxles() {
        return numAxles;
    }
}