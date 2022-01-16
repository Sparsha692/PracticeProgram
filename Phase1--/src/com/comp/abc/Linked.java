package com.comp.abc;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("Mangalore");
	list.add("Bangalore");
	list.add("Pune");
	System.out.println("Adding the things: "+list);
	list.remove(1);
	System.out.println("After removing the thing: "+list);

	}

}
