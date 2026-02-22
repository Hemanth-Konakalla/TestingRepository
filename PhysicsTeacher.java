package com.java.standard.edition.abstraction;

public class PhysicsTeacher extends Teacher {

	@Override
	public void teach() 
	{
		System.out.println("PhysicsTeacher teaches physics subject");
		
	}

	@Override
	public void experiments() {
		System.out.println("PhysicsTeacher conducts physics experiments");
	}

}
