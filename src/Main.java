public class Main {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Management System ===\n");

        Car car = new Car("Toyota", 2022, 4, "Petrol");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2021, true);
        Truck truck = new Truck("Volvo", 2020, 15.5, 4);

        Driver driver1 = new Driver("John Doe", "DL123456");
        Driver driver2 = new Driver("Jane Smith", "DL654321");

        driver1.assignVehicle(car);
        driver1.assignVehicle(motorcycle);
        driver2.assignVehicle(truck);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car;
        vehicles[1] = motorcycle;
        vehicles[2] = truck;

        System.out.println("=== Operating Vehicles ===");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nVehicle " + (i + 1) + ":");
            vehicles[i].startEngine();
            vehicles[i].displayInfo();
            vehicles[i].stopEngine();
        }

        System.out.println("\n=== Driver Information ===");
        driver1.displayDriverInfo();
        System.out.println();
        driver2.displayDriverInfo();

        System.out.println("\n=== Vehicle-Specific Information ===");
        car.displayCarInfo();
        motorcycle.displayMotorcycleInfo();
        truck.displayTruckInfo();
    }
}