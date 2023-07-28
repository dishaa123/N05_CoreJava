/* Ask the user for their birth year encoded as two digit (like "62") and for the current year ,also encoded as two digit(like "99")
 * write a program to find user current age in year*/
package org.tnsif.challenges;
import java.util.*;
public class abc {
	
      static void age(int curr_year,int birth_year) {
    	  int age;
    	   if(curr_year > birth_year) {
    		    age =curr_year-birth_year;
    		      System.out.println(age);
    	   }
    	   else {
    		   System.out.println((100-birth_year)+curr_year);
    	   }
      }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current year:");
		int curr_year=sc.nextInt();
		System.out.println("Enter birth year:");
		int birth_year=sc.nextInt();
        age(curr_year,birth_year);
	}

}
