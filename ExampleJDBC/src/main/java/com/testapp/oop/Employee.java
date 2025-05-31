package com.testapp.oop;
public class Employee {
   
    private int empId;
    private String name;
    private String department;
    private double salary;

  
    public Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

   
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "John Doe", "IT", 75000.00);
        emp1.displayDetails();
    }
}
