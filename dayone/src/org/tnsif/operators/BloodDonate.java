package org.tnsif.operators;
import java.util.*;
public class BloodDonate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		System.out.println("Enter Weight:");
		int weight = sc.nextInt();
		
        if(age >= 18 && weight >= 50) {
        	System.out.println("person is eligible to donate the blood");
        }
        else {
        	System.out.println("person is not eligible to donate the blood");
        }
	
	}

}
