package main;

import entities.ConnClient;
import entities.ConnServer;
import entities.ConnectorState;

public class MainConnectionApp {

	public static void main(String[] args) {
		
		ConnectorState connector = new ConnectorState();
		
		connector.setCurrentConnection("connectedClient");
		connector.notify(new ConnClient());
		
		System.out.println();
		
		connector.setCurrentConnection("connectedServer");
		connector.notify(new ConnServer());
		
	}

}
