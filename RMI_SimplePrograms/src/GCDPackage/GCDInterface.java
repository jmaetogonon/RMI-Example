package GCDPackage;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GCDInterface extends Remote {

	public int getGCD(int x, int y) throws RemoteException;
	
}
