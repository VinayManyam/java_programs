package Polym;

public class PolmB1 extends PolmA1 {
static void m1() {
	
	System.out.println("PolmB1 static m1()");
	}
	void m2() {
		super.m1();
		super.m2();
		System.out.println("PolmB1 m2()");
	}
	void m3(String A) {
		super.m3();
		super.m3(40);
		System.out.println("PolmB1 m3()");
	}
	
	public static void main(String []a) {
		PolmA1 b=new PolmB1();
		b.m1();
		System.out.print("method overriding:");
		b.m2();
		b.m3();
		System.out.print("method overLoading:");
		b.m3(5);
		System.out.println("==========function OverRiding=============");
		
		PolmB1 c=new PolmB1();
		c.m1();
		c.m2();
		System.out.print("method overLoading:");
		c.m3("hello");
		
	}
	
	
}
