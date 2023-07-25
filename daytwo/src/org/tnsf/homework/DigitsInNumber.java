package org.tnsf.homework;
import java.util.*;
public class DigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Numbers:");
		int num=sc.nextInt();   //number which taken as input
		int count=0;       //here store value of digit
		
	   do {
		   num=num/10;     
		   count++;
	   }while(num!=0);  
	  System.out.println("Total digit in Number is:"+count);
	  
	}

}
