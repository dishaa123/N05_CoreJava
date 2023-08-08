package org.tnsif.abstractkeyword;

public abstract class Opearator {
	//abstract
  abstract void opearation();
  abstract void multiplication();
  /* is abstract class contain more than one method,then provide the implementation 
   * to all the abstract method of that class inside the child class*/
  //concrete method
  void print(int a,int b) {
	  System.out.println(a+b);;
  }
}
