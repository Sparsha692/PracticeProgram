package com.comp.abc;

public class Rotatearray {
	public static void main(String[] args) {
		int[] n1={1,2,3,4,4,5,6,7,8,9,10};
	    int[] n2={11,12,13,14,15,16,17,18,19,20};
	    array(n1);
	    array(n2);

	}
	public static int[] array(int[] number)
	{
		System.out.print(number[9]+" ");
		System.out.print(number[8]+" ");
		System.out.print(number[7]+" ");
		System.out.print(number[6]+" ");
		System.out.print(number[5]+" ");
		System.out.print(number[4]+" ");
		System.out.print(number[3]+" ");
		System.out.print(number[2]+" ");
		System.out.print(number[1]+" ");
		System.out.println(number[0]+" ");
	    return number;
	  
	}

}