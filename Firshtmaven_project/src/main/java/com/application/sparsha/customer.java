package com.application.sparsha;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class customer//for getting the customer details 
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
            customer customer = new customer();

//			Get a reference to the Statement
			customer.theStatement = dbCon.createStatement();
            customer.getcustomer(dbCon);
          }
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("Some issues : " + e.getMessage());
		}

	}
	void getcustomer(Connection dbCon) throws SQLException {
		// Write the query to fetch all records from table:students
		qry = "select * from customer";

		// Execute the query
		theResultSet = theStatement.executeQuery(qry);

		// Traverse through the results
		while (theResultSet.next()) {
			System.out.print("CustomerId: " + theResultSet.getString("customerid")+".");
			System.out.print(", CustomerName :" + theResultSet.getString("customername")+".");
			System.out.println(", product: " + theResultSet.getString("customerproduct")+".");
		}
	}



}

