package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Midfielder;

public class MidfielderTest {

	@Test
	public void testPlaySomeonePlayerMidfielder() {
		Midfielder ip = new Midfielder();
		assertEquals("I'm a midfielder", ip.play());
	}
}
