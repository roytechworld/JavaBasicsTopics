package com.prsoft.javabucket.ArrayTopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateOverArrayListProg {
	
	public static void main(String[] args)
	{
	
    List<String> obj=new ArrayList<String>();
    obj.add("Madan");
    obj.add("Mohan");
    obj.add("sohan");
    
    Iterator<String> itobj=obj.iterator();
    
    
    while(itobj.hasNext())
    {
    obj.set(2, "Rohan");
    	
    	System.out.println("List value "+itobj.next() );
    }
	}


	

}
