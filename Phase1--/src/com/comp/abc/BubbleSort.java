package com.comp.abc;

public class BubbleSort {

	public static void main(String[] args)
	{
		    int[] array= {25,20,15,5,10};
		     bubbleSort(array);
		     System.out.println("The sorted thing is...");
		     for(int i=0;i<array.length;i++)
		     {
              System.out.print(array[i]+" ");
		     }
	}

		    public static void bubbleSort(int[] array)
		    {
		        int size = array.length;
		        int temp = 0;
		        for(int index=0;index<size;index++)
		        {
		            for (int last=1;last<(size);last++)
		            {
		                if(array[last-1]>array[last])
		                {
		                temp = array[last-1];
		                array[last-1]= array[last];
		                array[last]= temp;
		                }
		            }
		        }
		    }
}
		        
		        
		


