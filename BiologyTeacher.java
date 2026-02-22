package com.java.standard.edition.abstraction;

public class BiologyTeacher extends Teacher {
   //Overrided the teach() from Teacher abstract class
   //added by hemanthbranch to test pull request
   //hemanthbranch
	//this is the testing code for abstraction concept
   //hemanthline
	//testing line
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
