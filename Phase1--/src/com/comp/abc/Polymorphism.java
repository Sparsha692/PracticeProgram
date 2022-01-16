package com.comp.abc;

public class Polymorphism {

	public static void main(String[] args) {
		
		Polymorphism p = new Polymorphism();
		p.Polymorphism("Sunny");
		p.Polymorphism(22);
		p.Polymorphism("RLJIT", "ECE");

	}
	public void Polymorphism(String name)
	{
		System.out.println("My name is... "+name);
		System.out.println("-------------------------------");
	}
	public void Polymorphism(int age)
	{
		System.out.println("My age is... "+age);
		System.out.println("--------------------------------");
	}
	public void Polymorphism(String Collegename,String branch)
	{
		System.out.println("My collegename is..."+Collegename);
		System.out.println("My branch is... "+branch);
	}
	

}
