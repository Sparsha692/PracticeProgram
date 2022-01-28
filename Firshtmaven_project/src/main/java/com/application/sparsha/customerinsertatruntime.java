package com.application.sparsha;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class customerinsertatruntime 
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
            customerinsertatruntime customer = new customerinsertatruntime();

//			Get a reference to the Statement
			customer.theStatement = dbCon.createStatement();
           Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter customer name, id and product :");
			
			String name = scan.nextLine();
			int id = scan.nextInt();
			String product = scan.nextLine();
			customer.customerruntime(dbCon, id, name, product);
   		

   		} catch (ClassNotFoundException | SQLException e) {
   			System.out.println("Some issues : " + e.getMessage());
   		}

   	}
	private void customerruntime(Connection dbCon, int customerid, String customername, String customerproduct) {
		qry = "insert into customer values(" + "'" + customerid + "'" + ", '" + customername + "'" + ", '" + customerproduct + "'"
				+ ")";

//		Execute the query
		try {
			if(theStatement.executeUpdate(qry) > 0)
				System.out.println("Added the new customer...");
		} catch (SQLException e) {
		System.out.println("Issues while inserting from runtime : " + e.getMessage());
		}
	}
	
}