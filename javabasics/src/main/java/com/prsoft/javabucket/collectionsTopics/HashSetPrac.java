package com.prsoft.javabucket.collectionsTopics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> set =new HashSet<String>();
		
		set.add("Asus");
		set.add("HCL");
		set.add("Sony");
		set.add(null);
		set.add(null);//Only one null value accepted
		
		Iterator<String> iobj=set.iterator();
		
		for(String obj:set)
		{
			System.out.println(obj);
		}
		
				
		
		
		

	}

}
