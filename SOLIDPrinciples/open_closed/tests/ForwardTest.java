package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entities.Forward;

public class ForwardTest {

	@Test
	public void testPlaySomeonePlayerForward() {
		Forward ip = new Forward();
		assertEquals("I'm a forward", ip.play());
	}
}
