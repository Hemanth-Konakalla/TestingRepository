package com.java.standard.edition.abstraction;

public abstract class Teacher 
{
	//abstract methods
	public abstract void teach();
	
	public abstract void experiments();
	
	//concrete method
	public void display()
	{
		System.out.println("This is concrete method from Teacher class");
	}

}
