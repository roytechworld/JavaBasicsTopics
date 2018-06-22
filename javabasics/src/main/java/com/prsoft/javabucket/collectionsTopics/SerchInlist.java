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
		
		List<String> list2=new LinkedList<String>();
	    list2.add("Sony");
		list2.add("Apple");
		list2.add("Samsung");
		list2.add("Htcf");		
		
		List<String> list3=new LinkedList<String>(list);
		list3.removeAll(list2);
		
		for(String a:list3)
		{
			System.out.println(a);
		}
		
		
		
		if(list.contains("Sony"))
		{
			list.remove("Sony");
		}
		
		System.out.println("Serach and remove"+list);

	}

}
