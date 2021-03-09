import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import CountPackage.CountInterface;
import GCDPackage.GCDInterface;

public class RMIClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		GCDInterface gcdServant = (GCDInterface) Naming.lookup("rmi://localhost:1049/gcd");
		CountInterface countServant = (CountInterface) Naming.lookup("rmi://localhost:1049/count");
		
		System.out.println("The GCD is " + gcdServant.getGCD(12, 4));
		System.out.println("Vowels: " + countServant.countVow("Bird"));
		System.out.println("Consonants: " + countServant.countCons("Bird"));		

	}
}
