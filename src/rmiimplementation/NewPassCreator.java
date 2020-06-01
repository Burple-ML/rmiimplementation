package rmiimplementation;
import java.io.*;
public class NewPassCreator {

	public static void main(String[] args) throws IOException {
		Writer fw = new FileWriter("Passwords.txt", true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    //bw.newLine();
		String password6 = "Henrypass";
		String hashed6 = BCrypt.hashpw(password6, BCrypt.gensalt());
		String username6 = "Henry";
		String fulluser6 = username6 + ";" + hashed6;
		System.out.println(fulluser6);
		bw.write(fulluser6);
		bw.newLine();
	    //bw.write("the text");
	    //more code
	    //bw.newLine();
	    //bw.write("more text");
	    //more code
		String password8 = "Idapass";
		String hashed8 = BCrypt.hashpw(password8, BCrypt.gensalt());
		String username8 = "Ida";
		String fulluser8 = username8 + ";" + hashed8;
		System.out.println(fulluser8);
		bw.write(fulluser8);
		bw.newLine();
	    //bw.newLine();
		bw.close();
}
}
