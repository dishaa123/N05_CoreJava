package org.tnsif.introduction;
import java.util.*;
public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = sc.nextInt();
        System.out.println("value of num is :"+num);
        
        System.out.println("enter a number:");
        float num1 = sc.nextFloat();
        System.out.println("value of num is :"+num1);
        
        System.out.println("enter a char:");
        char c=sc.next().charAt(0);
        System.out.println("value of char is :"+c);
        
        System.out.println("enter a String:");
        String str = sc.nextLine();
       // sc.next();
        System.out.println("value of string is :"+str);
        
	}

}
