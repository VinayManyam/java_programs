package oops;

public class Circle implements Shape {

	private double s;

	public Circle(double s) {
		this.s=s;
			}
	public void area() {
		System.out.println("Area of Circle:"+3.14*s*s);
	}

	public void perimeter() {
		System.out.println("Perimeter of Circle:"+2*3.14*s);
	}

	public void printR() {
		System.out.println("R:"+s);
		
	}
}
