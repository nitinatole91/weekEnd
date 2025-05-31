package com.testapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.jdbc.Driver;

//DELIMITER //
//
//CREATE PROCEDURE getStudNamesByAddress(
//    IN p_address VARCHAR(255)
//)
//BEGIN
//    SELECT student_name
//    FROM student
//    WHERE student_address = p_address;
//END //
//
//DELIMITER ;



public class CallPreStudentExample2 {
	public static void main(String[] args) throws SQLException {
		Driver dr=new Driver();
		DriverManager.registerDriver(dr);
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		if(connection!=null)
		{
			System.out.println("Database is connected successfully...! ");
			
			CallableStatement call = connection.prepareCall("{call getStudNamesByAddress(?)}");

			// Set input parameter
			call.setString(1, "At pune");

			// Execute and get ResultSet directly
			ResultSet rs = call.executeQuery();

			// Process the ResultSet
			while (rs.next()) {
			    String name = rs.getString("student_name");
			    System.out.println("Student Name: " + name);
			}

			System.out.println("Procedure executed successfully!");

			
			
		}
		
	}

}
