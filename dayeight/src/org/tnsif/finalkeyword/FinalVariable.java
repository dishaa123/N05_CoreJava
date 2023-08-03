package org.tnsif.finalkeyword;
/* program to demonstrate on final keyword with variable*/
public class FinalVariable {
	//The blank final field NUMmay not have been initialize
       //final int NUM; 
	
	final float SALARY = 78000.67f;
	
	public void print() {
		/* we cant change the value of final variable*/
		//SALARY=89000.56f;
		System.out.println("Salary is: "+SALARY);
	}
}
