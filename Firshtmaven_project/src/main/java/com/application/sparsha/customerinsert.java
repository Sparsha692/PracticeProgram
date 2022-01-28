package com.application.sparsha;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class customerinsert 
{
	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/customers";

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
            customerinsert customer = new customerinsert();

//			Get a reference to the Statement
			customer.theStatement = dbCon.createStatement();
		    customer.addcustomer(dbCon);
          }
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("Some issues : " + e.getMessage());
		}

	}
//	Add a new Student into the table
	private void addcustomer(Connection dbCon) {
		// Write the query to insert
		qry = "insert into customer values(104, 'maurya', 'charger')";

		try {
//			Execute the query
			int result = theStatement.executeUpdate(qry);

			if (result > 0)
				System.out.println("Successfully registered the new student...");

		} catch (SQLException e) {
			System.out.println("Issues while inserting : " + e.getMessage());
		}
	}
}
