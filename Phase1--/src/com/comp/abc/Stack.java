package com.comp.abc;

public class Stack {

    public static void main(String[] args) 
    { 
    	Stack s = new Stack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
    }
         int number = 1000; 
    	 int h; 
    	  int arr[] = new int[number];  
   	
    	  	boolean push(int x) 
    	    	{ 
    	        		if (h >= (number-1)) 
    	        		{ 
    	            			System.out.println("Stack Overflow"); 
    	            			return false; 
    	        		} 
    	        		else
    	        		{ 
    	            			arr[++h] = x; 
    	            			System.out.println(x + " pushed into stack"); 
    	            			return true; 
    	        		} 
    	    	} 
}

