package org.tnsf.homework;
import java.util.*;
public class LeftAngleTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number:");
		
		
		//Right angle triangle
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Left angle triangle
	int row = sc.nextInt();       
		for (int i=0; i<row; i++){     
		        for (int j=2*(row-i); j>=0; j--) {  
		        	System.out.print(" ");   
	           	}   
            	for (int j=0; j<=i; j++ ){   
            		System.out.print("* ");   
	         	}   
            	System.out.println();   
		}  
	}
}
