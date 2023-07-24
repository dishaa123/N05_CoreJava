package org.tnsf.decisionmaking;
import java.util.*;
public class NestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		System.out.println("Enter the weight:");
		int weight=sc.nextInt();
		
		if(age >= 12) {
			if(weight >=40) {
				System.out.println("person is eligible to the bunjee jumping");
				if(weight >=110) {
					System.out.println("Extra ropes will be added");
			   	}
			 }
			else {
				System.out.println("Not eligible");
		    	}
		}
		else {
			System.out.println("person is not eligible to the bunjeejumping");
		}

	}

}
