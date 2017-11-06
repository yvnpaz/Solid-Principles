package main;

import entities.Calippo;
import entities.Cornetto;

public class MainInterfaceSegregation {

	public static void main(String [] args)
	{
		Calippo calippo = new Calippo();
		System.out.println("***");
		System.out.println("Calippo: ");
		calippo.calippo();
		calippo.triShape();
		
		Cornetto cornetto = new Cornetto();
		System.out.println("***");
		System.out.println("Cornetto: ");
		cornetto.triShape();
	}
}
