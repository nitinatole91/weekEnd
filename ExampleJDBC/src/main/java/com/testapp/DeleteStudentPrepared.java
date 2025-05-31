package com.testapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteStudentPrepared {
public static void main(String[] args) throws SQLException {
	Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	if(con1!=null) {
		System.out.println("Database is connected successfully ..! ");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Id.");
		int id=scanner.nextInt();
		
		PreparedStatement statement = con1.prepareStatement("delete from student where id=?");
		statement.setInt(1, id);
		int value = statement.executeUpdate();
		if(value>0) {
			System.out.println("Record Delete Successfully..!");
		}else {
			System.out.println("Some problem is there....!");
		}
	}else {
		System.out.println(" Database is not connected ...! ");
	}
}
}
