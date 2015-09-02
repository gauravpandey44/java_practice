package IO;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console c=System.console();
		
		System.out.print("Enter your name ");
		String name =c.readLine("%s","Usename: ");
		System.out.println("Enter  password");
		char [] ch=c.readPassword("%s", "Password");
		System.out.println("Username is "+name);
		String pass=new String(ch);
		System.out.println("Password is "+pass);
		
		

	}

}
