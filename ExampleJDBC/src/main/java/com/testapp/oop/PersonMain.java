package com.testapp.oop;

//Base class
class Person {
 String name;
 int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to display details
 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Subclass of Person
class Student extends Person {
 String studentId;

 // Constructor
 public Student(String name, int age, String studentId) {
     super(name, age); // Calls the constructor of Person
     this.studentId = studentId;
 }

 // Override display method
 @Override
 public void display() {
     super.display(); // Calls Person's display
     System.out.println("Student ID: " + studentId);
 }
}

//Subclass of Student
class CollegeStudent extends Student {
 String collegeName;

 // Constructor
 public CollegeStudent(String name, int age, String studentId, String collegeName) {
     super(name, age, studentId); // Calls the constructor of Student
     this.collegeName = collegeName;
 }

 // Override display method
 @Override
 public void display() {
     super.display(); // Calls Student's display
     System.out.println("College Name: " + collegeName);
 }
}

//Main class to test
public class PersonMain {
 public static void main(String[] args) {
     CollegeStudent cs = new CollegeStudent("Alice", 20, "S123", "XYZ University");
     cs.display();
 }
}

