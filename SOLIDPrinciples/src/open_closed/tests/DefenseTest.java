package open_closed.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import open_closed.entities.Defense;


public class DefenseTest {

	@Test
	public void testPlaySomeonePlayerDefense() {
		Defense ip = new Defense();
		assertEquals("I'm a defense", ip.play());
	}
}
