package bien.solucion1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bien.solucion1.Square;
import bien.solucion1.IRectangle;
import bien.solucion1.Rectangle;


public class TestArea {
	@Test
	public void testArea() {
		IRectangle r = new Rectangle(5, 4);
		assertEquals(20, r.calculateArea());
	}
	
	@Test
	public void testAreaSquare() {
		IRectangle r = new Square(5);
		assertEquals(25, r.calculateArea());
	}
}
