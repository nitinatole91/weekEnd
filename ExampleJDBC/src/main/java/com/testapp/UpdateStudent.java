package com.testapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudent {
public static void main(String[] args) throws SQLException {
	
	Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	if(con1!=null) {
		System.out.println("Database is connected successfully ..! ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Id:");
		int id = scanner.nextInt();
		scanner.nextLine(); // consume the leftover newline

		System.out.println("Enter Student address:");
		String address = scanner.nextLine();

		System.out.println("Enter Student name:");
		String name = scanner.nextLine();
		
		
		Statement statement = con1.createStatement();
		
		int value = statement.executeUpdate("update student set student_address='"+address+"' , student_name='"+name+"' where id="+id);
		if(value>0) {
			System.out.println("Record Updated Successfully..!");
		}else {
			System.out.println("Some problem is there....!");
		}
	}else {
		System.out.println(" Database is not connected ...! ");
	}
}
}
