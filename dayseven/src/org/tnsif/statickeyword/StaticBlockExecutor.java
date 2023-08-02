
package org.tnsif.statickeyword;

public class StaticBlockExecutor {
      static float salary;
      String comapanyName;
      /*static block is used to initialize static variable we can't assign a value for any non-static variable inside 
      the static block*/ 
      static {
    	  //comapanyname = "Accenture";
    	  salary = 57576.90f;
      }
      static void print() {    //static method
    	  System.out.println("Salary is the:"+salary);
      }
	public static void main(String[] args) {
	 print();
	}
}
