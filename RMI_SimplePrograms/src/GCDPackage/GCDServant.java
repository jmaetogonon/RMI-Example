package GCDPackage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GCDServant extends UnicastRemoteObject implements GCDInterface {

	public GCDServant() throws RemoteException {
		super();
	}

	@Override
	public int getGCD(int x, int y) throws RemoteException {
		while (x != y) {
			if (x > y) 
				x = x - y;
			else
				y = y - x;
		}
		return y;
	}

}
