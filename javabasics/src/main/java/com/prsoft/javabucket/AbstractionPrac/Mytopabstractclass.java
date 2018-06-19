package com.prsoft.javabucket.AbstractionPrac;



abstract class myTopabstract 
{
	public void display()
	{
		System.out.println("I am from abstract class");
	}
	
	
//	public abstract void dosometing();// This classes must be implemented why those class who extends abstract class
//	public abstract void dosometingmore();//
	
}



abstract class mysubclass extends myTopabstract  {
	
	
	
	public void display()
	{
		System.out.println("I am from subclass");
	}
	
	
	

}

public class Mytopabstractclass extends mysubclass
{
	
	public void display()
	{
		System.out.println("I am from child of subclass");
	}
	
	
	public static void main(String[] args)
	{
		
		mysubclass obj=new Mytopabstractclass();
		
		
		
		obj.display();
		
		
	}
	
}