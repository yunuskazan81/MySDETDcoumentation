package com.class30;

import java.util.ArrayList;

public class TaskArrayList {

	/*

		Create a generic ArrayList that will store 5 names into it.
		Find out whether the given ArrayList is empty or not?
		Check whether the specific name is present in an ArrayList or not?
		Find the size of your arrayList and print all values from that 


	 */
	
	
	public static void main(String[] args) {
		
	
	ArrayList <String> generic = new ArrayList <String>();
	
	generic.add("Alonso");
	generic.add("Matt");
	generic.add("jane");
	generic.add("John");
	generic.add("Ka");
	
	for (String name: generic) {
		
		System.out.println(name);
		
		
	}
	
	System.out.println(generic.contains("yunus"));
	
	System.out.println(generic.isEmpty());
	
	System.out.println(generic.size());
	
	}
	
}
