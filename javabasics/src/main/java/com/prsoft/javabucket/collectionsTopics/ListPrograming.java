package com.prsoft.javabucket.collectionsTopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrograming {
	
	
	
	public static void main(String[] args)
	{
		
		List<String> listobj=new ArrayList<String>();
		listobj.add("ram");
		listobj.add("sohan");
		listobj.add("Harish");
		
		listobj.remove("ram");
		Iterator<String> iob=listobj.iterator();
		
		while(iob.hasNext())
		{
			
		System.out.println(iob.next());	
			
			
		}
		
		
		
	}
	

}
