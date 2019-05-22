package com.prsoft.javabucket.collectionsTopics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaPprog {
	
	public static void main(String[] args)
	{
		HashMap<Object,Object> mapobj=new HashMap<Object,Object>();
		
		mapobj.put(1,"Roy");
		mapobj.put(2, "Any");
		mapobj.put(3, "Rahul");
		mapobj.put(4, "arvind");

		Iterator<Map.Entry<Object, Object>> iobj=mapobj.entrySet().iterator();

		while(iobj.hasNext())
		{
			Map.Entry<Object,Object> mobj=iobj.next();
			System.out.println(mobj.getKey().toString()+mobj.getValue().toString());
			
		}
		
	}
	
}
