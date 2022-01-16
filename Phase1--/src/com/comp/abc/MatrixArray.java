package com.comp.abc;

public class MatrixArray {

public static void main(String args[])
{
	
	int matrix1[][]={{1,2},{3,4},{5,6}};    
	int matrix2[][]={{7,8},{9,1},{2,3}};        
	int result[][]=new int[3][3];    
	for(int number1=0;number1<2;number1++){    
	for(int number2=0;number2<2;number2++){    
	result[number1][number2]=0;      
	for(int number3=0;number3<2;number3++)      
	{      
	result[number1][number2]=result[number1][number2]+matrix1[number1][number3]*matrix2[number3][number2];      
	} 
	System.out.println(result[number1][number2]); 
	}    
}    
	}
}  