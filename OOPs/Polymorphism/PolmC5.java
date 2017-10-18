package Polym;

public class PolmC5 extends PolmB5{
static void m2() {
	System.out.println("PolmC5 static m2()");
	System.out.print("PolmC5 m2()->PolmA5.m2():");
	PolmA5.m2();
}
}
