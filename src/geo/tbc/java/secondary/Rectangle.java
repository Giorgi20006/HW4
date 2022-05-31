package geo.tbc.java.secondary;

public class Rectangle {
	private static final double maxHeight;
	private static final double maxWidth;
	public static final int SOME_CONST = 25;
	double height, width;
	static double maxNum;
	static Rectangle maxObj;
	
	public static Rectangle getMax(Rectangle [] rectObjs){
		double[ ] areasOfobjs = new double[3];
		
		for (int i = 0; i < rectObjs.length; i ++ ) {
			areasOfobjs[i] = rectObjs[i].getArea();
		}
		
		for (int j = 0; j < areasOfobjs.length; j++) {
			if (j != 0 && areasOfobjs[j] > areasOfobjs[j - 1]) {
				maxNum = areasOfobjs[j];
				maxObj = rectObjs[j];
			}
			else {
				maxNum = areasOfobjs[0];
				maxObj = rectObjs[0];
			}
		}
		
		return maxObj;
		// maqsimaluri fartobis mqone elementis dabrunebashi elementis misamartis dabruneba vifiqre,
		// tu fartobis mnishvnelobis dabruneba gvinda mashin return maxNum maxObj-is nacvlad da
		// public static double getMax - dasaxelebashi.
	}
	
	static {
		maxHeight = 10;
		maxWidth = 20;
	}
	
	public Rectangle(double height) {
		if (height <= maxHeight) {
			this.height = height;
		}
		else {
			this.height = maxHeight;
		}
	}
	
	public Rectangle(double height, double width) {
		if (height <= maxHeight) {
			this.height = height;
		}
		else {
			this.height = maxHeight;
		}
		if (width <= maxWidth) {
			this.width = width;
		}
		else {
			this.width = maxWidth;
		}
	}
	
	public Rectangle() {
		if (SOME_CONST <= maxWidth) {
			width = SOME_CONST;
		}
		else {
			width = maxWidth;
		}
	}

	
	public String getDimensions() {
		String output = "Height: "+height + " Width: " + width;
		return output;
	}
	
	double getPerimeter() {
		double perimeter = (height+width)*2;
		return perimeter;
	}
	
	double getArea() {
		double area = height*width;
		return area;
	}
	
	public int compareObjs(Rectangle rectObj1) {
		double area1 = rectObj1.getArea();
		double area2 = this.getArea();
		int x = 0;
		
		if(area1 > area2){
			x += 1;
		}
		else if(area1<area2) {
			x -=1;
		}
		return x;
	}
	
}
