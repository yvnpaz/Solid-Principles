package bien.solucion2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bien.solucion2.Cuadrado;
import bien.solucion2.Rectangle;

public class TestArea {

	@Test
	public void testArea() {
		Rectangle r = new Rectangle(5, 4);
		assertEquals(20, r.calculateArea());
	}
	
	@Test
	public void testAreaSquare() {
		Rectangle r = new Cuadrado(5);
		assertEquals(25, r.calculateArea());
	}
}
