package org.tnsf.loopingstatement;
import java.util.*;
public class ForLoop {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {        //for row
            for(int j=1;j<=n;j++) {     //for column
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
