package entities;

import boundaries.Notifier;

public class ConnClient implements Notifier {

	@Override
	public void alertConnected(String connected) {
		if (connected == "connectedClient") {
			System.out.print("You are connected as Client.");
		}
	}
}
