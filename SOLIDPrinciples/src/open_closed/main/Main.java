package open_closed.main;

import open_closed.entities.Defense;
import open_closed.entities.Forward;
import open_closed.entities.Midfielder;
import open_closed.entities.Player;

public class Main {

	public static void main(String[] args) {

		Player player = new Player(new Forward());
		
		System.out.println("Play in the position: "+player.getPosition());
		
		Player playerBack = new Player(new Defense());
		System.out.println("Play in the position: "+playerBack.getPosition());
		
		Player playerMid = new Player(new Midfielder());
		System.out.println("Play in the position: "+playerMid.getPosition());
		
	}

}
