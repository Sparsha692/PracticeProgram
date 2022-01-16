package com.comp.abc;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		 int[] array = {11,4,6,7,5,9,2};
		    int l= (array.length-1);
		    int value = 4;
		    int result;
		    result = values(array,l,value);

		    if(result>0)
		    {
		    	  System.out.println( "Element is  present in the array at index :"+result);
		     
		    }
		    else 
		    {
		    	  System.out.println( "Element is not present in the array");
		       }
		    }
		    
		public static int values(int[] array ,int l, int value ){

		        if(array[0]==value)
		        {
		            return 0;
		         }
		        int index=1;
		        while(index<l && array[index]<=value){

		            index=index*2;
		        }
		        return Arrays.binarySearch(array,index/2,Math.min(index,l),value);
		        }
		}

