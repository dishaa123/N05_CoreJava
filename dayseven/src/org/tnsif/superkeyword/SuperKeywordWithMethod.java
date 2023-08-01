package org.tnsif.superkeyword;
class Sports{
	String sportsName="Cricket";
	void display() {
		System.out.println("Sports name is:"+sportsName);
	}
}
class Cricket extends Sports{
	int noOfPlayers=11;
	void display() {
		/* if parent and child class methods are same and if we want to call parent class method inside the child class then use 
		 * super.methodeName()*/
		super.display();
		System.out.println("No.of.Players is :" +noOfPlayers);
	}
}
public class SuperKeywordWithMethod {
	public static void main(String[] args) {
		 Cricket c = new Cricket();
		 c.display();
	}

}
