import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import CountPackage.CountServant;
import GCDPackage.GCDServant;

public class RMIRegistry {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		
		 Registry registry = LocateRegistry.createRegistry(1049);
		 //for gcd servant
		 registry.bind("gcd", new GCDServant());
		 
		 //for count servant
		 registry.bind("count", new CountServant());

		 
		 System.out.println("Registry is running...");

	}

}
