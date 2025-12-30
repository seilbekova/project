public abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}