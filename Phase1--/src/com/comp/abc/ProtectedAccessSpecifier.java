package com.comp.abc;

public class ProtectedAccessSpecifier {
	String star="INFINITE";

	public static void main(String[] args) {
		
		ProtectedAccessSpecifier p = new ProtectedAccessSpecifier();
		p.star();

	}
	protected void star()
	{
	System.out.println("Dispaly the number of stars in the universe: " +star);	
		
	}

}
