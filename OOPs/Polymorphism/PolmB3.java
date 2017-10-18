package Polym;

public class PolmB3 extends PolmA3 {

	static void m1() {
		System.out.println("PolmB3 static m1()");
	}
void m2() {
	//super.m2();
		System.out.println("PolmB3 m2()");
	}
void m4(String s) {
	System.out.println("PolmB3 m4(par)");
}


public static void main(String []a) {
	System.out.println("=========A3 Instance=============");
	PolmA3 b=new PolmB3();
	b.m1();
	//b.m2();
	b.m3();
	b.m4();
	
	System.out.println("=========B3 Instance=============");
	
	PolmB3 c=new PolmB3();
	c.m1();
	c.m2();
	c.m3();
	c.m4();
	c.m4("a");
			
}

	
}
