package main;

import entities.Defense;
import entities.Forward;
import entities.Midfielder;
import entities.Player;

public class MainOpenClosed {

	public static void main(String[] args) {

		Player player = new Player(new Forward());
		
		System.out.println("Play in the position: "+player.getPosition());
		
		Player playerBack = new Player(new Defense());
		System.out.println("Play in the position: "+playerBack.getPosition());
		
		Player playerMid = new Player(new Midfielder());
		System.out.println("Play in the position: "+playerMid.getPosition());
		
	}

}
