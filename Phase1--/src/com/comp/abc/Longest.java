package com.comp.abc;

public class Longest {

	public static void main(String[] args) {
		int array[] = {11,22,44,55,7,8,6,};
		int numbers = array.length;
		sequence(array,numbers);
	}
	
	    static void sequence(int a[], int number)
	    {
	        int list[] = new int[number];
	        int x, y, largest = 0;
	        for (x = 0; x < number; x++)
	        {
	            list[x] = 1;
	        }
	        for (x = 1; x < number; x++)
	            for (y = 0; y < x; y++)
	                if (a[x] > a[y] && list[x] < list[y] + 1)
	                {
	                    list[x] = list[y] + 1;
	                }
	        for (x = 0; x < number; x++)
	            if (largest < list[x])
	            {
	                largest = list[x];
	            }
	        System.out.println("Length of the values: "+largest);


}
}




