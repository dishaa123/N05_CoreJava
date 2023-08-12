package org.tnsif.uncheckedexception;
import java.util.*;
/* program to  demonstrate on arithmetic exception*/
public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		//try block contain exception code
		try {
			System.out.println("Ans is: " +x/y);
		}
		catch(Exception e){
			//catch block is used to handle an exception
			System.out.println("Exception handeled"+e);
		}

	}

}
