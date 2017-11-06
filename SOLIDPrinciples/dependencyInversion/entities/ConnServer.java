package entities;

import boundaries.Notifier;

public class ConnServer implements Notifier {

	@Override
	public void alertConnected(String connected) {
		if (connected == "connectedServer") {
			System.out.print("You are connected as Server.");
		}
	}
}
