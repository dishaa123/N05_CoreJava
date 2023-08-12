package org.tnsif.customexception;
import java.util.Scanner;
/* Program to demonstrate on User-defined Exception*/
// driver class
public class CustomExceptionExecutor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email and Password : ");
		String email = sc.nextLine();
		String password = sc.nextLine();
		try {
		    if(email.equals("disha@metbkc.com") && password.equals("Pass@123")) {
			   System.out.println("Crendetial matched");
		     }
	     	else {
			   throw new LoginCredentials("Invalid credentials");
		     }
	    }
		catch(LoginCredentials e) {
		    	System.out.println(e);
		}

	}
}
