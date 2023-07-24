package org.tnsf.loopingstatement;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		
	//example 1
	/*	int x=21;
		do {
			System.out.println("Value of x:"+x);
			x++;
		}while(x<20); */
		
 //example 2
		Scanner sc=new Scanner(System.in);
		System.out.println("Input is:");
		int n=sc.nextInt();
		do {
			System.out.println("Value of n is:"+n);
			n++;
		}while(n<14);
	}

}
