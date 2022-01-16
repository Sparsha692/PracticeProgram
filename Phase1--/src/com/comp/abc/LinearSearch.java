package com.comp.abc;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
             int[] array = {1,2,3,4,5,6,7};

		        Scanner sc = new Scanner(System.in);
		        System.out.println("Searching Element");
		        int Value = sc.nextInt();
		        
		        int result = searching(array,Value);
		        if(result==0){

		                System.out.println("Element not in the array");
		            } else {

		                System.out.println("position of the element "+result+" elements key search number is "+array[result]);
		            }
		        }

		public static int searching(int array[], int key) {

		    int arraylength = array.length;
		    for (int index = 0; index < arraylength - 1; index++) {

		        if (array[index] == key) {
		            return index;
		         }
		     }
		            return -1;
		   }
		}

