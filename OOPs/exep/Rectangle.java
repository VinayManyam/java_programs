package oops;

public class Rectangle implements Shape {
private double l;
private double b;
public Rectangle(double l,double b) {
	this.l=l;
	this.b=b;
	}
public void area() {
	System.out.println("Area of Rectangle:"+l*b);
}

public void perimeter() {
	System.out.println("Perimeter of Rectangle:"+2*(l+b));
}

public void printLB() {
	System.out.println("l:"+l);
	System.out.println("b:"+b);
}

}
