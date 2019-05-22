package com.prsoft.javabucket.ArrayTopics;

import java.util.ArrayList;
import java.util.List;

public class SearchElemeentsInArrayList {
	
	
	public static void main(String[] args)
	{
		
		List<String> objectlist=new ArrayList<String>();
		objectlist.add("Ranjay");
		objectlist.add("Sanjay");
		objectlist.add("Sourav");
		objectlist.add("Baibhabh");
		
		System.out.println("List value.."+objectlist);
		
		boolean check=objectlist.contains("Sourav");
		
		if(check)
		{
			int index= objectlist.indexOf("Sourav");
			System.out.println("Value found "+objectlist.get(index));
			
		}
		
	}
	
}
