package org.tnsif.interfacedemo;

public interface DebitCard {
	/* By default all the variables inside an interface is public static and if it final then we must  have to intialize value 
	 * for that variable*/
         long cardno=234567898765432L;
         // we can not use concrete method inside an interface 
         // By default ,method inside an interface is an abstract
         void displayCardDetails() ;
         //default method and static method is the new features of java8 in which can we use inside an interface
          default void display() {
        	  System.out.println("Default Method");
          }
          //static method
          static void print() {
        	  System.out.println("static method");
          }
}