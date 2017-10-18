package Polym;

public class PolmA6 {
static int a=10;
int x=20;

static void m1() {
	System.out.println("PolmA6 static m1()");
}

private void m2() {
	System.out.println("PolmA6 m2()");
}
void m3() {
	System.out.println("PolmA6 m3()");
	System.out.println("x:"+x);
	System.out.println("a:"+a);
	System.out.print("PolmA6 m3()->m1():");
	m1();
	System.out.print("PolmA6 m3()->m2():");
	m2();
	
}


}
