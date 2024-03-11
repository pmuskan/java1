// Define the Vehicle class
class Vehicle {
    // Attributes
    protected double speed;
    protected double fuelCapacity;

    // Constructor
    public Vehicle(double speed, double fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    // Method to accelerate
    public void accelerate() {
        System.out.println("Vehicle is accelerating.");
    }

    // Method to refuel
    public void refuel() {
        System.out.println("Vehicle is refueling.");
    }
}

// Define the Car class, subclass of Vehicle
class Car extends Vehicle {
    // Additional attribute for Car
    private int numWheels;

    // Constructor
    public Car(double speed, double fuelCapacity, int numWheels) {
        super(speed, fuelCapacity);
        this.numWheels = numWheels;
    }

    // Method specific to Car
    public void drive() {
        System.out.println("Car is driving.");
    }
}

// Define the Bicycle class, subclass of Vehicle
class Bicycle extends Vehicle {
    // Additional attribute for Bicycle
    private int numGears;

    // Constructor
    public Bicycle(double speed, double fuelCapacity, int numGears) {
        super(speed, fuelCapacity);
        this.numGears = numGears;
    }

    // Method specific to Bicycle
    public void pedal() {
        System.out.println("Bicycle is pedaling.");
    }
}

// Main class to showcase inheritance
public class Main {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car(100, 50, 4);
        System.out.println("Car speed: " + car.speed);
        System.out.println("Car fuel capacity: " + car.fuelCapacity);
        car.accelerate();
        car.drive(); // Car specific method

        // Create a Bicycle object
        Bicycle bicycle = new Bicycle(30, 0, 6);
        System.out.println("Bicycle speed: " + bicycle.speed);
        System.out.println("Bicycle fuel capacity: " + bicycle.fuelCapacity);
        bicycle.accelerate();
        bicycle.pedal(); // Bicycle specific method
    }
}
