package com.java.standard.edition.abstraction;

public class Test
{
	public static void main(String[] args) 
	{
		PhysicsTeacher pt = new PhysicsTeacher();
		ChemistryTeacher ct = new ChemistryTeacher();
		BiologyTeacher bt = new BiologyTeacher();
		School s = new School();
		s.staff(pt);
		s.staff(ct);
		s.staff(bt);
		
	}

}
