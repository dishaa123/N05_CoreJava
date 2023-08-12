package org.tnsif.uncheckedexception;
import java.util.Scanner;
import java.io.IOException;
/* Program to demonstrate on throw and throws keyword*/
public class ThrowExecutor {
  //throws keyword is used to declare an exception
	static void isEligible(int age,int weight) throws IOException{
		 if(age > 18 && weight>50) {
			 System.out.println("Eligible to donate the blood");
		 }
		 else 
			 //throw keyword is used to declare an exception explicitly
			 throw new IOException("Age and Weight criteria is not fullfilled");
	}
	public static void main(String[] args) throws IOException{
	       Scanner sc = new Scanner(System.in);
	       System.out.println("enter age : ");
	       int age =sc.nextInt();
	       System.out.println("enter weight : ");
	       int weight=sc.nextInt();
	       isEligible(age,weight);
	}
}
