package com.comp.abc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Kaziranga");
		a.add("Nagaland");
		a.add("Bangalore");
		System.out.println("Printing the list: "+a);
        a.remove(1);
        System.out.println("After removing one list: "+a);
        System.out.println("--------------------------------------");
        LinkedList<Integer> b = new LinkedList<Integer>();
        b.add(15141);
        b.add(25867);
        b.add(3254);
        b.remove(0);
        System.out.println("Printing the linkedlist: "+b);
        System.out.println("--------------------------------------");
        Vector<Double> c = new Vector<Double>();
        c.add(25.253);
        c.add(524.2);
        c.add(9578.2);
        c.add(25.2);
        System.out.println(c);
        c.remove(2);
        System.out.println("Printing the vector: "+c);
        System.out.println("-----------------------------------------");
        HashSet<Integer> d =new HashSet<Integer>();
        d.add(15141);
        d.add(25867);
        System.out.println("Printing the hashset: "+d);
        System.out.println("------------------------------------------");
        
	}

}
 