package org.tnsif.challenges;
/* There are n people standing in circle waiting to be executed .the count out begins at some point in the circle 
 * and trucsits around the circle an a fix direction.In is Step a certain number no.of people are skipped and next person is executed.
 * The elimination trucsits around the circle(which becoming smaller and smaller as the executer people are remove),until only 
 * the last persons remains,who is given freedom.
 * given the total no.of persons and no.k which indicates k-1 person are skipped and the kth person is killed in circle.
 * task is to choose the person in the initial circle that survives.
 *
 * */
import java.util.*;
public class xyz {
	static int survive(int n, int k) {
		if(n==1) {
			return 1;
		}
		else {
			return (survive(n-1,k)+k-1)%n+1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
         int n=sc.nextInt();
         System.out.println("enter the k value:");
         int k=sc.nextInt();
        System.out.println( "Output is the :"+survive(n,k));
	}

}
