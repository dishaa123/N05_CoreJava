/* program to demonstrate on cascaded if-else*/
package org.tnsf.decisionmaking;
import java.util.*;
public class CascadedIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a,b,c:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("a is grater :"+a);
		}
		else if(b > a && b>c) {
			System.out.println("b is grater :"+b);
		}
		else {
			System.out.println("c is grater :"+c);
		}
		
	}
}
