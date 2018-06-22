package com.prsoft.javabucket.collectionsTopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Comprable interface is basically used for sorting items or compare objects of the same class;
public class ComprableProg implements Comparable<ComprableProg>{
	
	private String employeename;
	private int salary;
	


	public int compareTo(ComprableProg o) {
		// TODO Auto-generated method stub
		
		
		return this.salary-o.salary;
	}
	
	
	public ComprableProg(int salary)
	{
		this.salary=salary;
	}

 

	public static void main(String[] args)
	{
		
		List<ComprableProg> lstobj=new ArrayList<ComprableProg>();
		lstobj.add(new ComprableProg(23000));
		
		lstobj.add(new ComprableProg(23344));
		lstobj.add(new ComprableProg(5000));
		lstobj.add(new ComprableProg(10000));
		lstobj.add(new ComprableProg(30000));
		
		Collections.sort(lstobj);
		
		for(ComprableProg c: lstobj)
		{
			System.out.println("salary " +  c.salary);
		}
	}

 
	
	
	

}
