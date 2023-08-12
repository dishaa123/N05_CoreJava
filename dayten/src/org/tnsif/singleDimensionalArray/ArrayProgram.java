package org.tnsif.singleDimensionalArray;
/* program to demonstrate on array using compile-time input value*/
public class ArrayProgram {
	public static void main(String[] args) {
		//declaration and initialization of an array at compile time
		int arr[]= {44,56,2,32,45};
		System.out.println("the array of second index is :"+arr[2]);
		
		//to print all the value of an array
		System.out.println("elements in array is :");
		for(int i:arr) {
			System.out.print(i +" ");
		}

	}

}
