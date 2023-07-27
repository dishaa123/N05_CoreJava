package org.tnsif.singleinheritance;
//derived/child class
public class Student extends Citizen{
	//private datamembers
	private int rollno;
    private String collageName;
    
    //default constructor
	public Student() {
	//	super(); - it calls to parent class default constructor
		super();
		System.out.println("Child class-Default Constructor");	
	}
	
//parameterized constructor
	public Student(String city, int pinCode, long aadharNo, long contactNo,int rollNo,String collageName) {
		super(city, pinCode, aadharNo, contactNo);
		this.rollno=rollno;
		this.collageName=collageName;
	}
//getter and setters
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	//toString method of derived / child class
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collageName=" + collageName + ", toString()=" + super.toString() + "]";
	}

	

	
	
    
    
    
    
    
    
}
