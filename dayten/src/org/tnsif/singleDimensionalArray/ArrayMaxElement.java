package org.tnsif.singleDimensionalArray;
import java.util.*;
/* program to demonstrate on run-time array and find out largest element in array*/
public class ArrayMaxElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element in array:");
		int n=sc.nextInt();
		//array declaration
		int arr[]=new int[n];
		//array initialization
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}	
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println();
		System.out.println("The largest element in array is :"+max);	
		//Array is a class and sort is the built i n method
		Arrays.sort(arr);
		System.out.println("sorted array is :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
