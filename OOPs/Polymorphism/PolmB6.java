package Polym;

public class PolmB6 extends PolmA6{
static int a=30;
int x=40;

static void m1() {
	System.out.println("PolmB6 static m1()");
}

void m2() {
	System.out.println("PolmB6 m2()");
	System.out.println("x:"+x);
	System.out.println("a:"+a);
	}
void m4() {
	System.out.print("PolmB6 m4()->super.a");
	System.out.println(" a:"+super.a);
	
	System.out.print("PolmB6 m4()->super.x");
	System.out.println(" x:"+super.x);
	
	System.out.print("PolmB6 m4()->m2():");
	m2();
	
}
}
