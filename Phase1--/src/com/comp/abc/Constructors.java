package com.comp.abc;

public class Constructors {

	public static void main(String[] args) 
	{
		
	 new Constructors ();
	 new Constructors (25);
	 new Constructors (75.2,30);
	 
	}
	
    public Constructors()
    {
    	System.out.println("Displaying the constructor without the arguments:...");
    }
    public Constructors(int one)
    {
    	System.out.println("Displaying the constructor with int arguments:..."+one);
    }
    public Constructors(double one,int two)
    {
    	System.out.println("Displaying the constructor with double arguments:..."+ one + "  Second argument= "+two);
    }
   
    
    
}
