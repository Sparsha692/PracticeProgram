package com.comp.abc;

public class DiamondProblem {

	public static void main(String[] args) 
	{
      details d = new details();
      d.swimming();
      d.water();
	}
}
	interface hobbies
	{  
	    abstract void swimming() ;
	   
	} 
	interface requirements 
	{  
	    abstract void water();
	
	} 

	class details implements hobbies,requirements
	{
		@Override
		public void swimming()
		{
			System.out.println("These students are really good swimmer!!!!!!");
		}
		@Override
		public void water()
		{
			System.out.println("Water plays a very important role in swimming.....");
		}
	}
