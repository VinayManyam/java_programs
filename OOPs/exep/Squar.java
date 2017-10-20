package oops;

public class Squar implements Shape{
	private double s;

	public Squar(double s) {
		this.s=s;
			}
	public void area() {
		System.out.println("Area of Square:"+s*s);
	}

	public void perimeter() {
		System.out.println("Perimeter of Square:"+4*s);
	}

	public void printS() {
		System.out.println("s:"+s);
		
	}
}
