package entities;

import boundaries.Position;

public class Player {

	Position position;
	
	public Player(Position position) {
		this.position = position;
	}
	
	public String getPosition()
	{
		return this.position.play();
	}

}
