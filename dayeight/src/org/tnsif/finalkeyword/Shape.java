package org.tnsif.finalkeyword;
/* program to demonstrate on final method*/
//public class final Shape == we cant inherit final class
public class Shape {
        final String shapename = "circle";
        //final method
        final void printShapeType() {
        	System.out.println(shapename);
        }
}
