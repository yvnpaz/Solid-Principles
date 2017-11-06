package entities;

import boundaries.Position;

public class Defense implements Position {

	@Override
	public String play() {
		return "I'm a defense";
	}

}
