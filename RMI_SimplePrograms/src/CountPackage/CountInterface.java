package CountPackage;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CountInterface extends Remote {
	
	public int countVow(String input) throws RemoteException;
	public int countCons(String input) throws RemoteException;

}
