package com.testapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class ExampleJDBC {
	public static void main(String[] args) throws SQLException {
		Driver dr=new Driver();
		
		DriverManager.registerDriver(dr);
		
		System.out.println("Driver is Successfully... ! ");
		System.out.println("#############################################################");
		
		Connection cons=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		if(cons!=null) {
			System.out.println("Database is connected successfully ..! ");
		}else {
			System.out.println(" Database is not connected ...! ");
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		if(con!=null) {
			System.out.println("Database is connected successfully ..! ");
//			Statement statement = con.createStatement();
//			int value = statement.executeUpdate("insert into student values(13,'at pune','priya')");
//			int value = statement.executeUpdate("update student set student_address='at mumbai' , student_name='priya' where id=13");
//			if(value>0) {
				System.out.println("Record Save Successfully..!");
//			}else {
//				System.out.println("Some problem is there....");
//			}
		}else {
			System.out.println(" Database is not connected ...! ");
		}
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		if(con1!=null) {
			System.out.println("Database is connected successfully ..! ");
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter Student address.");
			String address=scanner.nextLine();
			System.out.println("Enter Student name.");
			String name=scanner.nextLine();
			
			Statement statement = con1.createStatement();
			int value = statement.executeUpdate("insert into student values(14,'"+address+"','"+name+"')");
//			int value = statement.executeUpdate("update student set student_address='address' , student_name='name' where id=13");
			//also insert address ,name  in database table

//			int value = statement.executeUpdate("update student set student_address='"+address+"' , student_name='"+name+"' where id=13");
			if(value>0) {
				System.out.println("Record Save Successfully..!");
			}else {
				System.out.println("Some problem is there....!");
			}
		}else {
			System.out.println(" Database is not connected ...! ");
		}
	}

}
