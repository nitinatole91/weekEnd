package com.testapp.oop;

//Abstract class
abstract class Shape {
 // Abstract method
 abstract void draw();

 // Concrete method
 public void display() {
     System.out.println("Displaying the shape");
 }
}

//Derived class: Circle
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Derived class: Rectangle
class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Main class to test
public class abstractMain {
 public static void main(String[] args) {
     // Reference of abstract class pointing to Circle object
     Shape circle = new Circle();
     circle.draw();    // Calls Circle's draw()
     circle.display(); // Calls Shape's display()

     // Reference of abstract class pointing to Rectangle object
     Shape rectangle = new Rectangle();
     rectangle.draw();    // Calls Rectangle's draw()
     rectangle.display(); // Calls Shape's display()
 }
}
