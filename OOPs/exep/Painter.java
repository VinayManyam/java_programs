package oops;

public class Painter {
public static void main(String []a) {
	System.out.println("========= Rectangle =========");
	Rectangle r=new Rectangle(10,20);
	
	Shape n=new Rectangle(10,20);
	((Rectangle)n).area();
	r.perimeter();
	r.printLB();
	
	System.out.println("========= Square =========");
	Squar s=new Squar(10);
	Shape m=new Squar(15);
	((Squar)m).area();
	//s.area();
	s.perimeter();
	s.printS();
	
	System.out.println("========= Circle =========");
	Circle c=new Circle(5);
	c.area();
	c.perimeter();
	c.printR();
	
	
}
}
