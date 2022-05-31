package geo.tbc.java.main;

import geo.tbc.java.secondary.Rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		System.out.println(rect1.getDimensions());
		
		Rectangle rect2 = new Rectangle(20);
		System.out.println(rect2.getDimensions());
		
		Rectangle rect3 = new Rectangle(10,25);
		System.out.println(rect3.getDimensions());
		
		Rectangle obj1 = new Rectangle(15,10);
		Rectangle obj2 = new Rectangle(4,50);
		Rectangle obj3 = new Rectangle(14,19);
		
		System.out.println(Rectangle.getMax(new Rectangle[] {obj1,obj2,obj3}));
		
	}

}
