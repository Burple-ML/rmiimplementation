package rmiimplementation;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ApplicationServer {
	public static void main(String[] args) throws RemoteException {
		Registry registry = LocateRegistry.createRegistry(4020);
		registry.rebind("hello", new HelloServant());
		//registry.rebind("security", new Authenticator());

	}

}
