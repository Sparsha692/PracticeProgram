package com.application.sp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class WorkingWithPreparedStatement {
	
	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/application";

	public static final String USERNAME = "root";

	public static final String PASSWORD = "";
	
	private String qry;
	
	PreparedStatement thePreparedStatement;
	

	public static void main(String[] args) {
		

		try {
//			Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Try establishing the connection
			Connection dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
			
			Scanner scan = new Scanner(System.in);
			
//			System.out.println("Enter id, name and location of the new student");
//			
//			int id = scan.nextInt();
//			scan.nextLine();
//			
//			String userName = scan.nextLine();
//			
//			String userLocation = scan.nextLine();
//			
//			WorkingWithPreparedStatement ref = new WorkingWithPreparedStatement();
//			
//			ref.addNewStudent(dbCon, id, userName, userLocation);
			
			System.out.println("Enter name of student:");
			
			String userName = scan.nextLine();
			
			new WorkingWithPreparedStatement().getStudentDetailsByName(dbCon, userName);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Problems while loading the driver or connecting to the database : " + e.getMessage());
		}

	}
	
//	Add a new student
	private void addNewStudent(Connection dbCon, int userId, String userName, String userLocation) {
		
		
		qry = "insert into students values(?, ?, ?)";
		

		try {
//			Get a reference to the PreparedStatement object
			thePreparedStatement = dbCon.prepareStatement(qry);
			
//			Replace the placeholders with actual values
			thePreparedStatement.setInt(1, userId);
			
			thePreparedStatement.setString(2, userName);
			
			thePreparedStatement.setString(3, userLocation);
			
//			Execute the query
			if(thePreparedStatement.executeUpdate() > 0)
				System.out.println("New student added...");
			
			
			
		} catch (SQLException e) {
			System.out.println("Issues while inserting : " + e.getMessage());
		}
		
	}
	
	
//	Get Student details by his/her name
	private void getStudentDetailsByName(Connection dbCon, String userName) {
		qry = "select * from students where name = ?";
		
		try {
			thePreparedStatement = dbCon.prepareStatement(qry);
			
			thePreparedStatement.setString(1, userName);
			
			ResultSet rs = thePreparedStatement.executeQuery();
			
			while(rs.next()) {
				System.out.println("Id : " + rs.getInt("id") + ", Location : " + rs.getString("location"));
			}
			dbCon.close();
		} catch (SQLException e) {
			System.out.println("Issues while fetching student record : " + e.getMessage());
		}
		
		
		

	}
	
	
	
	
	
	
	
	

}

