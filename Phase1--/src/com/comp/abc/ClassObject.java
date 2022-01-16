package com.comp.abc;

public class ClassObject {

	public static void main(String[] args) {
		
     ClassObject co = new ClassObject();
     co.Gadgets();
     co.cars("Kwid");
	}
	public void Gadgets()
	{
		System.out.println("HEY choose the gadget according to your choice!!!!!");
		System.out.println("---------------------------------------------------");
	}
	public void cars(String str)
	{
	System.out.println("Which is your favourite car..= "+str);	
	}

}
