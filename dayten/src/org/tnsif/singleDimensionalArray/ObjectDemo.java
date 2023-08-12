package org.tnsif.singleDimensionalArray;
//driver class
//program to demonstrate on array of objects
public class ObjectDemo {
	public static void main(String[] args) {
		Employee arr[] = new Employee[4];
	  arr[0]= new Employee(101,"disha Aher",899.0);
	  arr[1]= new Employee(102,"Purva Aher",567.0);
	  arr[2]= new Employee(101,"Anvay Aher",1199.0);
	  arr[3]= new Employee(102,"Anushka Aher",1067.0);
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
	}
	}
}
