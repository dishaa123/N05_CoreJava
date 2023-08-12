package org.tnsif.uncheckedexception;
/* Program to demonstrate on ArrayIndexOutOfBoundExecption*/
public class ArrayIndexOutOfBoundExecptionExecutor {
     static void print(int arr[]){
    	 try {
    		 System.out.println(arr[4]);
    		 //System.out.println(arr[2]);
    	 }
    	 catch(Exception e) {
    		 System.out.println("Exception handeled :" +e);
    	 }
    	 //always executed
    	 finally {
    		 System.out.println("Finally block is always excuted");
    		 System.out.println(arr[0]);
    	 }
    	 System.out.println("Any statement outside the block is always executed");
     }
	public static void main(String[] args) {
		int arr[]= {12,4,6};
		print(arr);
		}

	}


