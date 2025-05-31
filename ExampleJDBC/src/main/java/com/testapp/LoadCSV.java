package com.testapp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoadCSV {
	public static void main(String[] args) throws Exception {
//		16.	Read a text file and count the number of lines and words.
		FileReader fr = new FileReader("C:\\Users\\Ni3\\Desktop\\demo.txt");
		BufferedReader br = new BufferedReader(fr);
		int lineCount = 0;
		int wordCount = 0;
		String line;

		while ((line = br.readLine()) != null) {
			lineCount++;
			String[] words = line.trim().split("\\s+");
			wordCount += words.length;
		}

		br.close();

		System.out.println("Number of lines: " + lineCount);
		System.out.println("Number of words: " + wordCount);
//		17.	Write a string to a file and then read it back.
		String data = "Hello! This is a test string written to a file.";

        try (FileWriter writer = new FileWriter("C:\\Users\\Ni3\\Desktop\\write.txt")) {
            writer.write(data);
            System.out.println("String written to file successfully!");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }	
// read it back.
		try (FileReader fr1 = new FileReader("C:\\Users\\Ni3\\Desktop\\write.txt");
               BufferedReader br1 = new BufferedReader(fr1)) {

               String line1;
               System.out.println("Reading file content:");
               while ((line1 = br1.readLine()) != null) {
                   System.out.println(line1);
               }

           } catch (IOException e) {
               System.out.println("Error while reading: " + e.getMessage());
           }
        
//		18.	Append content to an existing file.
		String filePath = "C:\\Users\\Ni3\\Desktop\\temo.txt"; // your existing file
		String contentToAppend = "\nThis is the new content to append.";

		try (FileWriter fw = new FileWriter(filePath, true)) {
			fw.write(contentToAppend);
			System.out.println("Content appended successfully!");
		} catch (IOException e) {
			System.out.println("An error occurred while appending: " + e.getMessage());
		}

//		19.	Copy contents from one file to another file.
		String sourceFile = "C:\\Users\\Ni3\\Desktop\\demo.txt";
		String destinationFile = "C:\\Users\\Ni3\\Desktop\\demo_copy.txt";

		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destinationFile)) {

			int content;
			while ((content = fis.read()) != -1) {
				fos.write(content);
			}

			System.out.println("File copied successfully!");

		} catch (IOException e) {
			System.out.println("Error while copying: " + e.getMessage());
		}

//		String row;
//		20.	Write a Java program to connect to a MySQL database and retrieve all records from an employees table.
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		if (conn != null) {
//			int value = 0;
//			while ((row = br.readLine()) != null) {
//				String cols[] = row.split(",");
//				PreparedStatement stmt = conn.prepareStatement("insert into employee values(?,?,?)");
//				stmt.setString(1, cols[0]);
//				stmt.setString(2, cols[1]);
//				stmt.setString(3, cols[2]);
//				value = stmt.executeUpdate();
//			}
//			if (value > 0) {
//				System.out.println("File uploaded successfully.....");
//			} else {
//				System.out.println("File not uploaded successfully.....");
//			}
			PreparedStatement statement = conn.prepareStatement("select * from employee");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String email = rs.getString("email");
				String name = rs.getString("name");
				String contact = rs.getString("contact");
				System.out.println(email + "   " + name + "     " + contact);
			}

		} else {
			System.out.println("Database is not connected");
		}
	}

}
