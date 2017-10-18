package Polym;

public class PolmB5 extends PolmA5{
static void m1() {
	System.out.println("PolmB5 static m1()");
}

void m3() {
	System.out.println("PolmB5 static m3()");
	System.out.print("PolmB5 m3()->m1():");
	m1();
	System.out.print("PolmB5 m3()->super.m2():");
	super.m2();
}


	
	
	
}
