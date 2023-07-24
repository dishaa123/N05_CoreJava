package org.tnsf.decisionmaking;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the songno as input:");
//		int songno =sc.nextInt();
//		switch(songno) {
//		        case  1:
//		        	System.out.println("Perfect");
//		        	break;
//		        case  2:
//		        	System.out.println("Oo Antava");
//		        	break;
//		        case  3:
//		        	System.out.println("Taki taki");
//		        	break;
//		        default:
//		        	System.out.println("Invalid Input");
//		}
		
		int age=sc.nextInt();
		switch(age) {
		case 18:
			System.out.println("children");
			break;
		case 30:
			System.out.println("younger");
			break;
		case 60:
			System.out.println("older");
			break;
		default:
			System.out.println("invalid input");
		}

	}

}
