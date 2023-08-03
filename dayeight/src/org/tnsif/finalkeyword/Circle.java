package org.tnsif.finalkeyword;

public class Circle extends Shape {
	 final float Area=34.5f;;
     //final method
	 
	 /* cannot override the final method from shape*/
    /*   void printShapeType() {
     	System.out.println(Area+"sq.cm");
     }
     */
      public void printShapeType(float area) {
    	  System.out.println(Area +" sq.cm" );
      }
}
