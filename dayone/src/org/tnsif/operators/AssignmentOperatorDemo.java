package org.tnsif.operators;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		int a=10;
		int x= 5;
		
		System.out.println("res is:"+(a+=x));
		System.out.println("res is:"+(a-=x));
		System.out.println("res is:"+(a*=x));
		System.out.println("res is:"+(a/=x));
		System.out.println("res is:"+(a%=x));
	}

}
