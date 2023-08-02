package org.tnsif.polymorphism;
import java.util.*;
class laptop{
	String generation1;
	 void specification(String generation1) {
		System.out.println("Laptop: "+generation1);
	}
}
class hp extends laptop{
	String generation2;
	void specification(String generation1,String generation2) {
		super.specification(generation1);
	    System.out.println("hp: "+generation2);
   }
}
public class MethodOverridingExecutor {
	public static void main(String[] args) {
		hp h=new hp();
		Scanner sc = new Scanner(System.in);
		String generation1=sc.nextLine();
		String generation2=sc.nextLine();
		h.specification(generation1,generation2);

	}

}
