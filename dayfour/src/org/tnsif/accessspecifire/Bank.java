/* program to demonstrate on access specifier */
package org.tnsif.accessspecifire;

public class Bank {
	//different access specifier
      public String bankName;
      private int pinNo;
      long accountNo=8754323456789L;
      
      //public method
      public void displayPubic() {
    	  System.out.println("Bank Name is :"+bankName);
      }
    //private method
      private void displayPrivate() {
    	  System.out.println("Pin No is :"+pinNo);
      }
    //default method
      void displayDefault() {
          System.out.println("Pin No is :"+pinNo);
      }
      
}
