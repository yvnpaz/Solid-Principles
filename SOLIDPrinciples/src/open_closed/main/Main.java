package open_closed.main;

import open_closed.entities.Defense;
import open_closed.entities.Forward;
import open_closed.entities.Player;

public class Main {

	public static void main(String[] args) {

		Player player = new Player(new Forward());
		
		System.out.println("Juega en la posicion: "+player.getPosition());
		
		Player playerBack = new Player(new Defense());
		System.out.println("Juega en la posicion: "+playerBack.getPosition());
		
	}

}
