/* program to demonstrate on encapsulation */
/* encapsulation  achives the data hiding using private access specifire*/
/*driver class*/
package org.tnsif.encapsulation;
public class encapsulationDemo {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		//setting a value for private member
		h.setAccountNo(567843256789L);
		h.setAccountType("Current Account");
		h.setCvvNo(233);
        h.setPinNo(1221);  
        //accessing and printing all the private members
       /* System.out.println("Account Number is:"+h.getAccountNo());
        System.out.println("Account Type is:"+h.getAccountType());
        System.out.println("Account Cvv No is:"+h.getCvvNo());
        System.out.println("Account Pin No. is:"+h.getPinNo());*/
        System.out.println(h); // by using tostring method
	}

}
