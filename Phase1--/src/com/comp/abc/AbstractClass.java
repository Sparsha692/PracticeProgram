package com.comp.abc;

abstract class AbstractClass {

	public static void main(String[] args) 
	{
      one o = new one();
      o.colour();
      o.todisplay();
			
 }
	 abstract public void colour();
	   public void todisplay()
	   {
		System.out.println("to display the message...");
	   }
	}
	class one extends AbstractClass
	{
		@Override
		public void colour()
		{
		System.out.println("the colour is red");	
		}
	



}
