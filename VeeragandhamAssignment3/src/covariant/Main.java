package covariant;

class Vehicle {
    Vehicle start() {
        System.out.println("The vehicle is starting.");
        return this;
    }
}

class Car extends Vehicle {
    @Override
    Car start() {
        System.out.println("The car is starting.");
        return this;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); // Output: The vehicle is starting.

        Car car = new Car();
        car.start(); // Output: The car is starting.
    }
}
