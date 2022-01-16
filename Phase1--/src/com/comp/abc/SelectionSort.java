package com.comp.abc;

public class SelectionSort {

	public static void main(String[] args) {
		    int[] array = {11,5,3,45,89,6,7,2};
		    selectionSort(array);
		    System.out.println("The sorted elements are:");
		    for(int index:array){
		        System.out.print(index+" ");
		         }
		     }

		    public static void selectionSort(int[] selection){

		        for(int index=0;index<selection.length;index++){

		            int starter =index;
		            for(int last=index+1;last<selection.length;last++){
		                if(selection[last]<selection[starter]){

		                    starter =last;
		                }
		            }
		            int smallNumber = selection[starter]; 
		            selection[starter]= selection[index];
		            selection[index]= smallNumber;
		        }
		    }
		}

