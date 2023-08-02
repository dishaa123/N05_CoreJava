/* program to demonstrate on compile time polymorphism*/
package org.tnsif.polymorphism;
import java.util.*;
class BollyWood{
	String str1,str2,str3;
	static void display(String str1,String str2) {
		System.out.println(str1+" Loves "+str2);
	}
	static void display(String str1,String str2,String str3) {
		System.out.println(str1+" Loves "+str2+" as well as "+str3);
	}
}
public class MethosOverloadingExecutor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		String str1=sc.next();
		String str2=sc.next();
		String str3=sc.next();
		BollyWood.display(str1,str2);
		BollyWood.display(str1,str2,str3);

	}

}
