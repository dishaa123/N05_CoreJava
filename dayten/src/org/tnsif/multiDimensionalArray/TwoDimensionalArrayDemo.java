package org.tnsif.multiDimensionalArray;
/* program to demonstrate on 2d array*/
import java.util.*;
public class TwoDimensionalArrayDemo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the element in array:");
		int arr[][]=new int[3][2];
		//outside array
		for(int i=0;i<3;i++) {   //inside array
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//for printing a values
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
              System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
	}
}
