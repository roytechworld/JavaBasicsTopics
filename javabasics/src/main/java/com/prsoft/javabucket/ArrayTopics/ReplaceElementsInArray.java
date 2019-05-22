package com.prsoft.javabucket.ArrayTopics;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> objectlist=new ArrayList<String>();
		objectlist.add("Rohan");
		objectlist.add("Sohan");
		objectlist.add("Archer");
		
		System.out.println("Objectlist are "+objectlist);
		
		int index=objectlist.indexOf("Sohan");
		objectlist.set(index,"Manmohan singh");
		
		System.out.println("Objectlist are after replacing "+objectlist);
		
	}

}
