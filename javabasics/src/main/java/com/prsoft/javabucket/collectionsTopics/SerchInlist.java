package com.prsoft.javabucket.collectionsTopics;

import java.util.LinkedList;
import java.util.List;

public class SerchInlist {

	public static void main(String[] args) {
		
		
		List<String> list=new LinkedList<String>();
		
		list.add("Sony");
		list.add("Apple");
		list.add("Samsung");
		list.add("Htc");
		
		
		
		
		if(list.contains("Sony"))
		{
			list.remove("Sony");
		}
		
		System.out.println("Serach and remove"+list);

	}

}
