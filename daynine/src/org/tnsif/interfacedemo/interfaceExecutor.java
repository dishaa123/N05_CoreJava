package org.tnsif.interfacedemo;
//driver class
//program to demonstrate on interface
public class interfaceExecutor {

	public static void main(String[] args) {
		//we cannot the instantiate an interface
		//DebitCard d = new DebitCard();
	    SBIdebitCard s = new 	 SBIdebitCard ();
	    s.displayCardDetails();
	    s.display();
	    // we can the  call default method of an interface using the obj of implementable class
	    /* print() is a static method inside an interface to call print() method we have to use interface_name.method name*/
	    DebitCard.print();
	    
	    CheesePopCorn c = new CheesePopCorn ();
	    c.displayRecipe();
	    
	    Person p = new Person();
	    p.showDrinkName();
	}

}
