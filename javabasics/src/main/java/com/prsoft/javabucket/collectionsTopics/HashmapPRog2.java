package com.prsoft.javabucket.collectionsTopics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HashmapPRog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TreeMap<Integer ,String> mapobj=new TreeMap<Integer, String>();
		HashMap<Integer ,String> mapobj=new HashMap<Integer, String>();
		mapobj.put(1, "Anil");
		mapobj.put(2, "Suraj");
		mapobj.put(null, null);
		mapobj.put(4, null);

		Iterator<Map.Entry<Integer, String>> iobj=mapobj.entrySet().iterator();
		
		
		while(iobj.hasNext())
		{
		
			Map.Entry<Integer, String> mapobj2=iobj.next();
			
			System.out.println(mapobj2.getKey());
			System.out.println(mapobj2.getValue());
			
			
			
		}
		
		
		
		

	}

}
