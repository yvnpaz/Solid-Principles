package mal.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import mal.Square;
import mal.Rectangle;

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
		Square r = new Square();
		r.setWidth(5);
		r.setHeight(4);
		assertEquals(20, r.calculateArea());
	}
}
