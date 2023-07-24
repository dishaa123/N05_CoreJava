package org.tnsf.loopingstatement;
import java.util.*;
public class whileLoop {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the numbers:");
        int n=sc.nextInt();
        int i=1;
        while(n>=i) {
        	System.out.print(n+" ");
        	n--;
        }
	}

}
