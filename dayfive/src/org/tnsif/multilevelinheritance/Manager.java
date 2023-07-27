package org.tnsif.multilevelinheritance;
//parent class (super class)
public class Manager {
 private String deptName;
 private String name;
 private int empID;
 
 
 //default constructor
public Manager() {
	System.out.println("Default constructor -Manager");
}

//parameterize constructor
public Manager(String deptName, String name, int empID) {
	super();
	this.deptName = deptName;
	this.name = name;
	this.empID = empID;
}
//toString method
@Override
public String toString() {
	return "Manager [deptName=" + deptName + ", name=" + name + ", empID=" + empID + "]";
}

//getters and setters method
public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getEmpID() {
	return empID;
}

public void setEmpID(int empID) {
	this.empID = empID;
}



 

}
