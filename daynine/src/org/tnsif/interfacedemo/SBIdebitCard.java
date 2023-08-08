package org.tnsif.interfacedemo;
//this is implementable class
public class SBIdebitCard implements DebitCard{

	@Override
	public void displayCardDetails() {
		System.out.println("Card Number is: "+cardno);
	}

}
