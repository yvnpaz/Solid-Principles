package mal;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArea {

	@Test
	public void testArea() {
		Rectangle r = new Rectangle();
		r.setWidth(5);
		r.setHeight(4);
		assertEquals(20, r.calculateArea());
	}
	
	@Test
	public void testAreaSquare() {
		Cuadrado r = new Cuadrado();
		r.setWidth(5);
		r.setHeight(4);
		assertEquals(20, r.calculateArea());
	}
}
