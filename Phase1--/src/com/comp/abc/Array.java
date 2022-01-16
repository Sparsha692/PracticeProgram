package com.comp.abc;

import java.util.Scanner;

public class Array {

	    public static void main(String[] args) {
            int a[]= {1,2,3,4,6,7,8};
            int b[]= {5,6,7,8}; 
	    	for(int i=0;i<5;i++) {
			System.out.println("Elements of array a: "+i);
			}
	    	System.out.println("Length: "+b.length);
	    	System.out.println("Length: "+a.length);
	    	System.out.println("--------------------------------------");
	    	
	    	int []values = new int[5];
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter five numbers");
			for(int index = 0; index < values.length; index++) {
				values[index] = scan.nextInt();
			}
			
			System.out.println("You entered the numbers as :");

			for(int value : values) {
				System.out.println(value);
   }

}
}
