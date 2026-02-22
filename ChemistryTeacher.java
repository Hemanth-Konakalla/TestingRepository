package com.java.standard.edition.abstraction;

public class ChemistryTeacher extends Teacher {

	@Override
	public void teach() {
		System.out.println("ChemistryTeacher teaches chemistry subject");
	}

	@Override
	public void experiments() {
		System.out.println("ChemistryTeacher conducts chemistry experiment");

	}

}
