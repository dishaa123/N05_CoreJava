package org.tnsif.singleDimensionalArray;
/* program to demonstrate on array of objects*/
public class Employee {
	//variable declaration
         private int ID;
         private String name;
         private double salary;     
         //parameterized constructor
		public Employee(int iD, String name, double salary) {
			super();
			ID = iD;
			this.name = name;
			this.salary = salary;
		}
		//getters and setters
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}     
}
