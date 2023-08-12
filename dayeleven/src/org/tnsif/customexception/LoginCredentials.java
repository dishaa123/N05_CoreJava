package org.tnsif.customexception;
import java.util.Arrays;
/* Program to demonstrate on User-defined Exception*/
public class LoginCredentials extends Exception{
    // Private data members  
	private String str;

	//geteers and setters
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
//parameterize constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	//toString() method==print the object
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}

	
	
     
}
