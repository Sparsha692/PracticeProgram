package com.comp.abc;

public class PublicAccessSpecifier {

	public static void main(String[] args) {
		
		PublicAccessSpecifier p = new PublicAccessSpecifier();
		p.clock();

	}
	public void clock()
	{
		double value =10.00;
		System.out.println("Display the value:="+value);
	}

}
