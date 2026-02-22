package com.java.standard.edition.abstraction;

public class BiologyTeacher extends Teacher {

	@Override
	public void teach() 
	{
		System.out.println("BiologyTeacher teaches biology subject");

	}

	@Override
	public void experiments() {
		System.out.println("BiologyTeacher conducts biology experiments");

	}

}
