package org.tnsif.superkeyword;
class Nationality{   //parent class
	String nationname;
	public Nationality(String nationname) {
		this.nationname = nationname;
		System.out.println(nationname);
	}	
}
class Person extends Nationality{     //child class
	String language;
	public Person(String nationname, String language) {
		//calling to parent class constructor
		super(nationname);
		this.language = language;
		System.out.println(language);
	}
	
}
public class SuperKeywordWithConstructor {
	public static void main(String[] args) {
		Person p=new Person("Germany","German");
		

	}

}
