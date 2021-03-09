package CountPackage;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class CountServant extends UnicastRemoteObject implements CountInterface {

	public CountServant() throws RemoteException {
		super();
	}


	@Override
	public int countVow(String input) throws RemoteException {
		input = input.toLowerCase();
		int vows = 0, cons = 0;
		for(int i = 0; i < input.length(); i++) { 
			char ch = input.charAt(i); 
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
				vows++; 
			} 
			else if((ch >= 'a'&& ch <= 'z')) {
				cons++;
			}
		}
		return vows;
	}

	@Override
	public int countCons(String input) throws RemoteException {
		input = input.toLowerCase();
		int vows = 0, cons = 0;
		for(int i = 0; i < input.length(); i++) { 
			char ch = input.charAt(i); 
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
				vows++; 
			} 
			else if((ch >= 'a'&& ch <= 'z')) {
				cons++;
			}
		}
		return cons;
	}

}
