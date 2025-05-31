package com.testapp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

//
//
//SELECT * FROM test.student;
//USE test;
//
//DELIMITER //
//
//CREATE PROCEDURE savestud(
//    IN p_id INT,
//    IN p_address VARCHAR(255),
//    IN p_name VARCHAR(255)
//)
//BEGIN
//    INSERT INTO student (id, student_address, student_name)
//    VALUES (p_id, p_address, p_name);
//END //
//
//DELIMITER ;
//


public class CallPreStudent {
	public static void main(String[] args) throws SQLException {
		Driver dr=new Driver();
		DriverManager.registerDriver(dr);
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		if(connection!=null)
		{
			System.out.println("Database is connected successfully...! ");
			
			CallableStatement call = connection.prepareCall("{call savestud(?,?,?)}");
			
			call.setInt(1, 14);
			call.setString(2, "At pune");
			call.setString(3, "Shubham");
			
			boolean b = call.execute();
			if (!b) {
				System.out.println("procedure execute successfully.! ");
			}else {
				System.out.println("procedure not execute successfully.! ");
				
			}
			
			
		}
		
	}

}
