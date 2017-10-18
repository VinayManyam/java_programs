package Polym;

public class PolmD4 extends PolmC4 {

	void m1() {
		System.out.println("PolmD4 m1()");
	}
	
	void m2() {
		
		System.out.println("PolmD4 m2()");
		System.out.print("PolmD4 super m2():");
		super.m2();
	}
	void m4() {
		System.out.println("PolmD4 m4()");
	}
	public static void main(String []a) {
		PolmD4 d=new PolmD4();
		d.m1();
		d.m2();
		d.m3();
		d.m4();
		
	}
}
