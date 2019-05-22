package com.prsoft.javabucket.ArrayTopics;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> objectlist=new ArrayList<String>();
		objectlist.add("Ananya");
		objectlist.add("Bharat");
		objectlist.add("Surya");
		
		System.out.println(" List... "+objectlist);
		
		int delIndex=objectlist.indexOf("Bharat");
		
		objectlist.remove(delIndex);
		
		System.out.println(" List after remove... "+objectlist);
		
	}

}
