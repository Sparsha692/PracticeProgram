package com.comp.abc;

public class BinarySearch {

	public static void main(String[] args) {
	int[] array = {3,9,23,45,56,59,67,78,81,90,93,95};
		        int value = 100;
		        int arraylength = (array.length-1);
		        search(array,5,value,arraylength);
		    }

		public static void search(int[] array, int trigger, int k, int m){

		        int middle = (trigger+m)/2;       
		        while(trigger<=m){

		            if(array[middle]<k){
		                trigger = middle + 1;
		            } else if(array[middle]==k){
		                System.out.println("Element is found at index :"+middle);
		                break;
		            }else {

		                m=middle-1;
		            }
		            middle = (trigger+m)/2;
		        }
		            if(trigger>m){

		                System.out.println("Element is not found");
		            }      
		    }
		}




