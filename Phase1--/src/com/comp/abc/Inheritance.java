package com.comp.abc;

public class Inheritance {

	public static void main(String[] args) {
		
		whatsappVersion2 w2 = new whatsappVersion2();
		
		w2.message();
		w2.photos();
		w2.audiorecord();
		w2.fundtransfer();
	}

}
class whatsappVersion1 
{
  public void message()
  {
	 System.out.println("Hello how are you");  
  }
  public void photos()
  {
	  System.out.println("We can even capture photos also in this great!!!");
	  System.out.println("-------------------------------------------------------------------");
	
  }
}
class whatsappVersion2 extends whatsappVersion1
{
	public void audiorecord()
	{
		System.out.println("Heyy in this new versions we can even record audio to communicate");
	}
	public void fundtransfer()
	{
		System.out.println("We can even transfer the money great improvement.....");
	}
}

