/* pratik is so much interested in gaurding and hence he plants more trees in his garden.
 * he plants tress in rectangular fashion with the order of row and column and number the tress in row wise order .
 * he planted the mango tree only in the first row ,first column ,and last column.so,given the tree no. and row and column.
 * your task is to find out whether the  given tree is mango tree or not
 * Input n=5(is rows and column),t=11*/

package org.tnsif.challenges;
import java.util.*;
public class MangoTreeExecuter {
     static void isMangoTree(int n, int t) {
    	 if(t%n==0 || t%n==1 || t<=5) {
    		 System.out.println("It is mango tree");
    	 }
    	 else {
    		 System.out.println("It is not mango tree");
    	 }
     }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values of n and k:");
		int n=sc.nextInt();
		int t=sc.nextInt();
		isMangoTree(n,t);

	}

}
