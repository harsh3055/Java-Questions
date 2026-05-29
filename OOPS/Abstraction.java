package org.example.OOPS;
// Data Abstraction is the property by virtue of
// which only the essential details are displayed to the user
// Abstract class representing a Vehicle (hiding implementation details)
//Abstract Class → "IS-A"
//Represents a hierarchy.

//Dog IS-A Animal
//Car IS-A Vehicle
//Interface → "CAN-DO"
//Represents capability/behavior.

//Upi can do payment
//credit card can do payment



abstract class Vehicle {
    // Abstract methods (what it can do)
    abstract void accelerate();
    abstract void brake();

    // Concrete method (common to all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}

// Concrete implementation (hidden details)
class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car: Pressing gas pedal...");
        // Hidden complex logic: fuel injection, gear shifting, etc.
    }

    @Override
    void brake() {
        System.out.println("Car: Applying brakes...");
        // Hidden logic: hydraulic pressure, brake pads, etc.
    }
}
public class Abstraction {
    public static void main(String[] args){
        Vehicle car = new Car();
        car.startEngine();
        car.accelerate();
        car.brake();
    }
}
