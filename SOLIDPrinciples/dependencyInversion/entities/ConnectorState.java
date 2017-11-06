package entities;

import boundaries.Notifier;

public class ConnectorState {
	
	String connecting;
	
	public void setCurrentConnection(String connectionState)
	{
		this.connecting = connectionState;
	}
	
	public void notify(Notifier notified)
	{
		notified.alertConnected(connecting);
	}

}
