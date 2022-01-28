package com.application.sparsha;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/application";

	public static final String USERNAME = "root";

	public static final String PASSWORD = "";

	String qry;

	Statement theStatement;

	ResultSet theResultSet;

	public static void main(String[] args) {

		try {
//        	1. Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

//			2. Try to establish the connection to database
			Connection dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);

			App theApp = new App();

//			Get a reference to the Statement
			theApp.theStatement = dbCon.createStatement();

			// getCountOfStudents(dbCon);

//			theApp.getAllStudents(dbCon);

			// theApp.addNewStudent(dbCon);

//			System.out.println("Successfully connected to the database now ...");
			
			Scanner scan = new Scanner(System.in);
			
//			System.out.println("Enter student name, location and id :");
//			
//			String name = scan.nextLine();
//			
//			String location = scan.nextLine();
//			
//			int id = scan.nextInt();
//			
//			theApp.addNewStudentDetailsFromRuntime(dbCon, id, name, location);
			
			
//			System.out.println("Enter id of student to update ");
			System.out.println("Enter id of student to delete ");
			
			int userId = scan.nextInt();
			
			scan.nextLine();
			
			theApp.deleteStudentDetails(dbCon, userId);
			
//			System.out.println("Enter name to update");
//			
//			String userName = scan.nextLine();
//			
//			theApp.updateStudentDetails(dbCon, userId, userName);
			
			

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Some issues : " + e.getMessage());
		}

	}

	private void getAllStudents(Connection dbCon) throws SQLException {
		// Write the query to fetch all records from table:students
		qry = "select * from students";

		// Execute the query
		theResultSet = theStatement.executeQuery(qry);

		// Traverse through the results
		while (theResultSet.next()) {
			System.out.print("ID: " + theResultSet.getString("id"));
			System.out.print(", Name :" + theResultSet.getString("name"));
			System.out.println(" from " + theResultSet.getString("location"));
		}
	}

//	Add a new Student into the table
	private void addNewStudent(Connection dbCon) {
		// Write the query to insert
		qry = "insert into students values(3, 'Afzal Hussain', 'Bangalore, India')";

		try {
//			Execute the query
			int result = theStatement.executeUpdate(qry);

			if (result > 0)
				System.out.println("Successfully registered the new student...");

		} catch (SQLException e) {
			System.out.println("Issues while inserting : " + e.getMessage());
		}
	}

//	Add a new Student into the table:students (Values from runtime)
	private void addNewStudentDetailsFromRuntime(Connection dbCon, int userId, String userName, String userLocation) {
		qry = "insert into students values(" + "'" + userId + "'" + ", '" + userName + "'" + ", '" + userLocation + "'"
				+ ")";

//		Execute the query
		try {
			if(theStatement.executeUpdate(qry) > 0)
				System.out.println("Added the new student...");
		} catch (SQLException e) {
		System.out.println("Issues while inserting from runtime : " + e.getMessage());
		}
	}
	
//	Update student details by id
	private void updateStudentDetails(Connection dbCon, int userId, String userName) {
		
		qry = "update students set name = '" + userName + "' where id = '" + userId + "'";
		

		try {
//			Execute the query
			if(theStatement.executeUpdate(qry) > 0)
				System.out.println("Student details updated successfully...");
		} catch (SQLException e) {
			System.out.println("Issues while updating : " + e.getMessage());
		}
		
	}
	
	
//	Delete student details by id
	private void deleteStudentDetails(Connection dbCon, int userId) {
		qry = "delete from students where id = '" + userId + "'";
		
		try {
//		Execute the query
		if(theStatement.executeUpdate(qry) > 0) 
			System.out.println("Student details deleted...");
		}catch(SQLException se) {
			System.out.println("Issues while deleting : " + se.getMessage());
		}
	}
	
	
	
	

//    A Method to get count of students
	private void getCountOfStudents(Connection dbCon) throws SQLException {

		// Write the query to fetch number of rows
		qry = "select count(*) from students";

		// Execute the query
		theResultSet = theStatement.executeQuery(qry);

		theResultSet.next();

		int countOfStudents = theResultSet.getInt(1);

		System.out.println("Number of students : " + countOfStudents);
	}
}



