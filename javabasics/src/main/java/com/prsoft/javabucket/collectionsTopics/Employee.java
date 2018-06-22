package com.prsoft.javabucket.collectionsTopics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee implements Comparator<Employee> {
	
	private String name;
	private int age;
	private int salary;
	
	
	

	public int compare(Employee obj1,Employee obj2)
	{
		int result=0;
		if(obj1.salary>obj2.salary)
		{
			result=1;
		}
		else if(obj1.salary<obj2.salary)
		{
			result=-1;
		}
		
		return result;
	}

	
	public Employee(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

public Employee()
{
	
}
	
	public static void main(String[] args)
	{
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee("Rakesh",33,4000));
		emplist.add(new Employee("Suresh",14,31000));
		emplist.add(new Employee("Aniket",33,35000));
		emplist.add(new Employee("Rehan",31,1000));
		
		
		Collections.sort(emplist, new Employee());
		
		for(Employee e: emplist)
		{
			System.out.println(e.name);
			System.out.println(e.salary);
		}
		
		
	}

}
