package entities;

import src.TriangularShape;

public class Cornetto implements TriangularShape {

	String shape;
	
	public Cornetto() {}

	public String getTriangularShape()
	{
		return this.shape;
	}
	
	@Override
	public void triShape() {
//		this.shape = "I'm a triangular";
		System.out.println("I'm a triangular");
	}
	
}
