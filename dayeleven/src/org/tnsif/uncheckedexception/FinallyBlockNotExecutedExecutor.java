package org.tnsif.uncheckedexception;
import java.util.*;
/* program to demonstrate on finally Block Executor*/
public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter x: ");
	    int x = sc.nextInt();
	    System.out.println("Enter y: ");
	    int y = sc.nextInt();
	    //try block contains exceptional code
	    try {
	    	System.out.println(x/y);
	    	//when we use System.exit(0),then finally block not executed.
	    	System.exit(0);
	    }
	    catch(Exception e) {
	    	System.out.println("Exception handled " +e);
	    	//when we use System.exit(0),then finally block not executed.
	    	//System.exit(0);
	    }
	    finally {
	    	/* when finally block contains an exception then finally block does not executed*/
	    	//System.out.println(4/0); .....it contains exception it will not executed
	    	System.out.println("Finally block is always executed");
	    }

	}

}
