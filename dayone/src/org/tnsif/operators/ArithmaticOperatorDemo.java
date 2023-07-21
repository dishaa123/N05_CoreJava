/* program to demonstrate on arithmetic operators */
package org.tnsif.operators;
import java.util.*;
public class ArithmaticOperatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers:");
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         
      //Arithmetic Operators
         System.out.println("Addition is:" +(num1+num2));
         System.out.println("Substraction is:" +(num1-num2));
         System.out.println("Division is:" +(num1/num2));
         System.out.println("modulus is:"+(num1%num2));
         sc.close();
	}

}
