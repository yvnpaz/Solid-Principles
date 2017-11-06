package entities;

import boundaries.Position;

public class Midfielder implements Position {

	@Override
	public String play() {
		return "I'm a midfielder";
	}

}
