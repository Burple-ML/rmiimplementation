package rmiimplementation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class HelloServant extends UnicastRemoteObject implements HelloService{
	
	public HelloServant() throws RemoteException {
		super();
	}

	public String echo(String input) throws RemoteException{		
		return "From Server:" + input;		
	}
	
	public int authenticate(String username, String password) throws RemoteException,IOException{
		//System.out.println("i am inside the function");
		int a = 0;
		File file2 = new File("Passwords.txt");
		//System.out.println("i am inside the function");
		    	if (file2 != null) {
		    		//System.out.println("Ive scanned file 2");
					Scanner scanner = new Scanner(file2);
					
					// Reading the Passwords file
					while (scanner.hasNextLine()) {
						//System.out.println("im in the while loop");
						String line = scanner.nextLine();
			
						if (line.substring(0, line.indexOf(";")).equals(username)) {
							//System.out.println("im also here");
							String hashed = line.substring(line.indexOf(";") + 1);
							if (BCrypt.checkpw(password, hashed)) {
								//System.out.println("i reached the final stage");
								scanner.close();
								a = 1;
								System.out.println(a);
								return a;
							}
						}
					}
					scanner.close();
					return a;
		    	}
			return a;	 			
	}	
	
	public int[] permissionList(String username) throws RemoteException,IOException {
		int[] permits = {0,0,0,0,0,0,0,0,0};
		File file3 = new File("UserRoles.txt");
		if (file3 != null) {
			Scanner scanner = new Scanner(file3);
			int i = 0;
			// Reading User roles file
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if (line.substring(0, line.indexOf(";")).equals(username)) {
					String role = line.substring(line.indexOf(";") + 1);
					System.out.print("You are a " + role);
					File file4 = new File("RolesPermissions.txt");
					Scanner scanner2 = new Scanner(file4);
					while(scanner2.hasNextLine()){
						String line2 = scanner2.nextLine();
						if(line2.substring(0, line2.indexOf(";")).equals(role)){
							String permissions = line2.substring(line2.indexOf(";") + 1);
							if (permissions.contains("1")) {
								permits[i] = 1;
								i = i+1;
							}
							if (permissions.contains("2")) {
								permits[i] = 2;
								i = i+1;
						
							}
							if (permissions.contains("3")) {
								permits[i] = 3;
								i = i+1;
							}
							if (permissions.contains("4")) {
								permits[i] = 4;
								i = i+1;
							}
							if (permissions.contains("5")) {
								permits[i] = 5;
								i = i+1;
							}
							if (permissions.contains("6")) {
								permits[i] = 6;
								i = i+1;
						
							}
							if (permissions.contains("7")) {
								permits[i] = 7;
								i = i+1;
							}
							if (permissions.contains("8")) {
								permits[i] = 8;
								i = i+1;
							}
							if (permissions.contains("9")){
								permits[i] = 9;
								i=i+1;
							}
							
						}
					
					}
					scanner2.close();
					
		}
				
	}
			scanner.close();
}
		return permits;
}
	public String echo2(String username) throws RemoteException,IOException{
		String rs = "";
		File file5 = new File("UserRoles.txt");
		Scanner scanner5 = new Scanner(file5);
		while(scanner5.hasNextLine()){
			String line5 = scanner5.nextLine();
			if (line5.substring(0, line5.indexOf(";")).equals(username)){
				String rs1 = line5.substring(line5.indexOf(";")+1);
				return rs1;
			}			
		}
		scanner5.close();
		return rs;
	}
	
}
