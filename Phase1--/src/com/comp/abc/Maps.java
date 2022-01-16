package com.comp.abc;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
   HashMap<String,Double> map =new HashMap<String,Double>();
    map.put("Vinyas",2546.0);
    map.put("Poorva",1250.2);
    map.put("Dharmik", 12568.2);
    System.out.println("Printing the hashmap: "+map);
    map.remove(1);
    System.out.println("After removing one map: "+map);
    System.out.println("------------------------------------------------");
    Hashtable<String,Double> table =new Hashtable<String,Double>();
    table.put("Vinyas",2546.0);
    table.put("Poorva",1250.2);
    table.put("Dharmik", 12568.2);
    System.out.println("Printing the hashmap: "+table);
    table.remove(1);
    System.out.println("After removing one map: "+table);
    System.out.println("------------------------------------------------");
    TreeMap<Integer,String> tree =new TreeMap<Integer,String>(); 
    tree.put(12,"doddy");
    tree.put(32, "foggy");
    tree.put(21, "kiddy");
    System.out.println("Treemap: "+tree);
    tree.remove(5);
    System.out.println("After removing the tree "+tree);
    

	}

}
