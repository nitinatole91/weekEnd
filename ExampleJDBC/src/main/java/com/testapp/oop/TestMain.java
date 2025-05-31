package com.testapp.oop;

//Superclass
class Vehicle {
 public void start() {
     System.out.println("Vehicle is starting");
 }
}

//Subclass
class Car extends Vehicle {
 // Overriding the start method
 @Override
 public void start() {
     System.out.println("Car is starting with keyless ignition");
 }

 public void start(String mode) {
     System.out.println("Car is starting in " + mode + " mode");
 }
}

public class TestMain {
 public static void main(String[] args) {
     // Create a Vehicle object
     Vehicle vehicle = new Vehicle();
     vehicle.start();  // Calls Vehicle's start()

     // Create a Car object
     Car car = new Car();

     // Overridden method
     car.start(); // Calls Car's overridden start()

     // Overloaded method
     car.start("Eco"); // Calls overloaded start(String mode)
 }
}
