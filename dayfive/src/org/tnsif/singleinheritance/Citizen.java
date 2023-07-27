package org.tnsif.singleinheritance;
//This is my base class
public class Citizen {
    private String city;
    private int pinCode;
    private long aadharNo;
    private long contactNo;
    
    //default constructor
    public Citizen() {
		System.out.println("Default Constructor");
	}
    
    //parameterize constructor
    public Citizen(String city, int pinCode, long aadharNo, long contactNo) {
		super();
		this.city = city;
		this.pinCode = pinCode;
		this.aadharNo = aadharNo;
		this.contactNo = contactNo;
		System.out.println("Parameterized Constructor");
	}
    
	//getters and setters method 
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	//toString method base/parent  class
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pinCode=" + pinCode + ", aadharNo=" + aadharNo + ", contactNo=" + contactNo
				+ "]";
	}
    
    
}
