package Polym;

public class PolmB2 extends PolmA2{
	static void m1() {
		PolmA2.m1();
			System.out.println("PolmB2 static m1()");
		}
	void m2() {
		//super.m2();
			System.out.println("PolmB2 m2()");
		}
	void m4(String s) {
		System.out.println("PolmB2 m4(par)");
	}
	
	
	public static void main(String []a) {
		System.out.println("=========A2 Instance=============");
		PolmA2 b=new PolmB2();
		b.m1();
		System.out.print("m2() overRiding:");
		//b.m2();
		b.m3();
		b.m4();
		
		System.out.println("=========B2 Instance=============");
		
		PolmB2 c=new PolmB2();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		c.m4("a");
				
	}
		
}
