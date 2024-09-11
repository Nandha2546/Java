package day03;

public class Rectangle {
	private double length;
	private final static double width;
	static {
		width=1.0;
	}
	
	public Rectangle(double length) {
		this.length = length;
		
	}
	
	public double MethodArea() {
		double result=(length*width);
		return result;
	}

	@Override
	public String toString() {
		
		return "Length:"+length + "\nWidth:" + width + "\nArea:" + MethodArea();
	}
	
	public static void main(String[] args) {
		Rectangle rect=new Rectangle(0);
		System.out.println(rect);
	}
		
	
	
}
