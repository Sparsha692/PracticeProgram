package com.comp.abc;

public class PrivateAccessSpecifier {

	public static void main(String[] args) {
		
		PrivateAccessSpecifier p = new PrivateAccessSpecifier();
		p.car();
		p.cycle();

	}
	private void car()
	{
		int wheels = 4;
		System.out.println("Dispaly the number of wheels in the car:="+ wheels);
	}
	private void cycle()
	{
		double wheels=2;
		System.out.println("Display the number of wheels in the cycle:="+wheels);
	}

}
