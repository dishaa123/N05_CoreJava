package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {
     void print(ThisKeywordDemoThree  t) {
    	 System.out.println("Hey there,I am using 'this'"+"keyword");
     }
     void display() {
    	 /* when u call parameterize method inside non-parameterized method then,we get an error to overcome 
    	  * that we have to this keyword as argument in method call*/
    	 print(this);
     }
	public static void main(String[] args) {
		ThisKeywordDemoThree t = new ThisKeywordDemoThree ();
		t.display();
	}

}