package com.comp.abc;

import java.util.ArrayList;
import java.util.Scanner;

public class Bugs 
{

	public static void main(String[] args) 
	{
     choice();
    }
    private static void choice()
    {
        String[] array = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] array1 = {1,2,3,4,5,6};
        int  length = array1.length;
        for(int index=0; index<length;index++)
        {
            System.out.println(array[index]);
           }
        ArrayList<Integer> listexecution = new ArrayList<Integer>();
        ArrayList<Integer> addition = new ArrayList<Integer>();
        addition.add(1000);
        addition.add(2300);
        addition.addAll(listexecution);
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter the required case: ");
        System.out.println("-----------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        int  multipalchoice =  scan.nextInt();
        for(int choice=1;choice<=length;choice++)
        {
            if( multipalchoice ==choice)
            {
    switch ( multipalchoice )
    {
        case 1:
      System.out.println("To review the expenditure : ");
      System.out.println("----------------------------------------------");;
          System.out.println(addition+"\n");
               choice();
                break;
               case 2:
                        System.out.println("For adding our Expenditure: ");
                        System.out.println("---------------------------------------------");
                        int one = scan.nextInt();
                        addition.add(one );
                        System.out.println("Your value is updated.....");
                        System.out.println("\n");
                        addition.addAll(listexecution);
                        System.out.println(addition);
                        System.out.println("\n");
                        choice();
               break;
                    case 3:
                    System.out.println("For deleting the expenditure of the individuals: ");
                    System.out.println("------------------------------------------------------");
                        int two= scan.nextInt();
                        if( two== multipalchoice )
                        {
                               addition.clear();
                            System.out.println(addition);
                            System.out.println("\n");
                            System.out.println("All the expenditures are removed..");
                            System.out.println("\n");
                        } 
                        else 
                        {
                            System.out.println("This did not workout u can try other options.");
                            System.out.println("----------------------------------------------------");
                        }
                        choice();
                        break;
                    case 4:
                        finding(addition);
                        choice();
                        break;
                    case 5:
                        searching(addition);
                        choice();
                        break;
                    case 6:
                        exit();
                        break;
                    default:
                        System.out.println("The choice you have entered is not avilable in the option you have..");
                        break;
                }
            }
        }

    }
    private static void exit() 
    {
        System.out.println("Exiting from the application..");
        System.out.println("\n");
            }
    private static void searching(ArrayList<Integer> c) 
    {
        int leng = c.size();
        System.out.println("For searching the required expenditure ");
        System.out.println("\n");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int index=0;index<leng;index++) 
        {
        	if(c.get(index)==input) 
        	{
        		System.out.println("Expenditure required is= " + input + " at " + index + "= rank");
        	}
        }
    }
    private static void finding(ArrayList<Integer> c1) 
    {
        int arrlength = c1.size();
        Collections.sort(c1);
        System.out.println("asaorted things at the end: ");
        for(Integer i: c1) {
        	System.out.print(i + " ");
        	System.out.println("---------------------------------------------");
        }
       
    }
}