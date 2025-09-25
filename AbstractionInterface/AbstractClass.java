package com.AbstractionInterface;

public class AbstractClass {
	public static void main(String[] args) {

		Square sq = new Square();
		Rectangle r1 = new Rectangle(5,10);
		
		sq.calArea();
		sq.show();
		
		r1.calArea();
		r1.show();
		
		
		//Shape s = new Square();
		
		
		
	}

}
