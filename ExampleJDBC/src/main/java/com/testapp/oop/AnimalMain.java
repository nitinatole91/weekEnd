package com.testapp.oop;

//Define the interface
interface Animal {
 // Abstract method
 void makeSound();

 // Default method (optional feature in interfaces)
 default void sleep() {
     System.out.println("Sleeping...");
 }
}

//Class implementing the interface
class Dog implements Animal {
 @Override
 public void makeSound() {
     System.out.println("Woof! Woof!");
 }
}

//Another class implementing the interface
class Cat implements Animal {
 @Override
 public void makeSound() {
     System.out.println("Meow! Meow!");
 }
}

//Main class to test
public class AnimalMain {
 public static void main(String[] args) {
     Animal dog = new Dog();
     dog.makeSound(); // Calls Dog's implementation
     dog.sleep();     // Calls default sleep() method

     Animal cat = new Cat();
     cat.makeSound(); // Calls Cat's implementation
     cat.sleep();     // Calls default sleep() method
 }
}
