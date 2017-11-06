package entities;

import src.TriColor;
import src.TriangularShape;

public class Calippo implements TriColor, TriangularShape {

	String tricolor;
	
	@Override
	public void calippo() {
		this.tricolor = "I have a tricolor";
		System.out.println("I have a tricolor");
	}

	@Override
	public void triShape() {
		System.out.println("I'm a triangular");
	}

}
