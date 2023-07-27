package org.tnsif.classandobjects;

public class practiceOops {

	String name;
	long age;
	String city;
	
	
	//parameter constructor
	public practiceOops(String name, long age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
   
	@Override
	public String toString() {
		return "practiceOops [name=" + name + ", age=" + age + ", city=" + city + "]";
	}


	//default constructor
	public practiceOops() {
		System.out.println("This is the default constructor");
	}

	


}
