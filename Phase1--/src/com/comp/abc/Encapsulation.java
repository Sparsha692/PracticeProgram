package com.comp.abc;

import java.util.Scanner;
class Encapsulation {
	private String Accountername;
	private double Accountnumber;
	private String Accounttype;

	public String getAccountername() {
		return Accountername;
	}

	public void setAccountername(String accountername) {
		Accountername = accountername;
	}

	public double getAccountnumber() {
		return Accountnumber;
	}

	public void setAccountnumber(double accountnumber) {
		Accountnumber = accountnumber;
	}

	public String getAccounttype() {
		return Accounttype;
	}

	public void setAccounttype(String accounttype) {
		Accounttype = accounttype;
	}
	public static void main(String[] args) {
      Encapsulation e= new Encapsulation();
      e.setAccountername("Panda");
      e.setAccountnumber(1524397);
      e.setAccounttype("Savings");
      System.out.println("Accountername.."+e.getAccountername());
      System.out.println("-------------------------------------------");
      System.out.println("Accountnumber.."+e.getAccountnumber());
      System.out.println("--------------------------------------------");
      System.out.println("Accounttype.."+e.getAccounttype());
      
      
		}
	

}