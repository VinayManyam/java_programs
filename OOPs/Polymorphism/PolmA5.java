package Polym;

public class PolmA5 {

	static void m1() {
		System.out.println("PolmA5 static m1()");
	}
	static void m2() {
		System.out.println("PolmA5 static m2()");
		System.out.print("PolmA5 m2()->m1():");
		m1();
	}
}
