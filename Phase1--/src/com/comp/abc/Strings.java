package com.comp.abc;

public class Strings {

	public static void main(String[] args) {
		Strings s = new Strings();
		s.Black("BLACK");
		s.Red("RED");
		s.White("WHITE");
		StringBuffer sb = new StringBuffer();
		sb.candle("Sparsha");
		StringBuilder sbu=new StringBuilder();
		sbu.Games("PUBG");

	}
	public void Black(String s1)
	{
		System.out.println("A Greatcolour That Obsserves The Heat: "+s1);
		System.out.println("String function:"+s1.charAt(0));
		System.out.println("---------------------------------------------------");
	}
	public void Red(String s2)
	{
		System.out.println("A Dangercolour: "+s2);
	}
	public void White(String s3)
	{
		System.out.println("A Peacecolour: "+s3);
		System.out.println("---------------------------------------------------");
	}

}
class StringBuffer
{
	public void candle(String str)
	{
		System.out.println("Checking the length of the string: "+str.length());	
		System.out.println("--------------------------------------------------------");
	}
	
}
class StringBuilder
{
	public void Games(String str1)
	{
		System.out.println("which game was famous in the year 2021..?= "+str1);
	}
}
