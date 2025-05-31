package com.testapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudentsPrepared {
	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		if(con!=null) {
			System.out.println("Database is Connected...!");
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("select * from student");
			while(rs.next()) {
//				int id=rs.getInt(1);
//				String address=rs.getString(2);
//				String name= rs.getString(3);
//				System.out.println(id+"  "+address+"\t"+name);
				int id=rs.getInt("id");
				String address=rs.getString("student_address");
				String name= rs.getString("student_name");
				System.out.println(id+"   "+address+"     "+name);
			}
			
		}else {
			System.out.println("Database is not connected...!");
		}
		
	}

}
