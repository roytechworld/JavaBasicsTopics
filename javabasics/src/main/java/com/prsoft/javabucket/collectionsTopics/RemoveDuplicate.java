package com.prsoft.javabucket.collectionsTopics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
	
	
	
	public static void main(String[] args)
	{
		
		List<String>  listobj=new ArrayList<String>();
		
		listobj.add("House");
		listobj.add("Box");
		listobj.add("Tree");
		listobj.add("Box");
	
		
		HashSet<String> setobj=new HashSet<String>(listobj);//Set cannot contains duplicate values so it is used for remove duplicacy
		
		for(String s : setobj)
		{
			System.out.println(s);
		}
		
	}
	
	

}
