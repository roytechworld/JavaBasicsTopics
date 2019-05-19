package com.prsoft.javabucket.collectionsTopics;

import java.util.HashMap;
import java.util.Set;

public class HashMapPrac4 {
	
	public static void main(String[] args)
	{
		
		HashMap<String,String> hsh=new HashMap<String,String>();
		hsh.put("a", "anil");
		hsh.put("b","rohit");
		
		Set<String> keys=hsh.keySet();
		
		for(String k:keys)
		{
			System.out.println("Keyset found"+k);
					
		}
		
		
	}

}
