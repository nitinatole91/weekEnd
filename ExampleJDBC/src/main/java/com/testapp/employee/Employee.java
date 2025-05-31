package com.testapp.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Employee {
	public static void main(String[] args) throws SQLException {
		Driver dr=new Driver();
		DriverManager.registerDriver(dr);//Driver load successfully.
		Connection cons=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		if(cons!=null) {
			System.out.println("Database is connected successfully ..! ");
		}else {
			System.out.println(" Database is not connected ...! ");
		}
		
		
	}
	

}
