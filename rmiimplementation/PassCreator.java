package rmiimplementation;
import java.io.*;
import java.util.*;
public class PassCreator {

	public static void main(String[] args) throws IOException {	
		try {
			//File file = new File("test1.txt");
			//FileWriter fileWriter = new FileWriter("test2.text");
			Writer file = new FileWriter("Passwords.txt");
			BufferedWriter out = new BufferedWriter(file);
			String password = "Alicepass";
			String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
			String username = "Alice";
			String fulluser = username + ";" + hashed;
			System.out.println(fulluser);
			out.write(fulluser);
			out.newLine();
			String password1 = "Bobpass";
			String hashed1 = BCrypt.hashpw(password1, BCrypt.gensalt());
			String username1 = "Bob";
			String fulluser1 = username1 + ";" + hashed1;
			System.out.println(fulluser1);
			out.write(fulluser1);
			out.newLine();
			String password2 = "Ceciliapass";
			String hashed2 = BCrypt.hashpw(password2, BCrypt.gensalt());
			String username2 = "Cecilia";
			String fulluser2 = username2 + ";" + hashed2;
			System.out.println(fulluser2);
			out.write(fulluser2);
			out.newLine();
			String password3 = "Davidpass";
			String hashed3 = BCrypt.hashpw(password3, BCrypt.gensalt());
			String username3 = "David";
			String fulluser3 = username3 + ";" + hashed3;
			System.out.println(fulluser3);
			out.write(fulluser3);
			out.newLine();
			String password4 = "Ericapass";
			String hashed4 = BCrypt.hashpw(password4, BCrypt.gensalt());
			String username4 = "Erica";
			String fulluser4 = username4 + ";" + hashed4;
			System.out.println(fulluser4);
			out.write(fulluser4);
			out.newLine();
			String password5 = "Fredpass";
			String hashed5 = BCrypt.hashpw(password5, BCrypt.gensalt());
			String username5 = "Fred";
			String fulluser5 = username5 + ";" + hashed5;
			System.out.println(fulluser5);
			out.write(fulluser5);
			out.newLine();
			String password6 = "Georgepass";
			String hashed6 = BCrypt.hashpw(password6, BCrypt.gensalt());
			String username6 = "George";
			String fulluser6 = username6 + ";" + hashed6;
			System.out.println(fulluser6);
			out.write(fulluser6);
			out.newLine();
			out.close();
			
			File file2 = new File("Passwords.txt");
			Scanner scanner = new Scanner(file2);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
				//if (BCrypt.checkpw(username, line))
					//System.out.println("It matches");
				//else
					//System.out.println("It does not match");
			}
			
			//fileWriter.flush();
			//fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
