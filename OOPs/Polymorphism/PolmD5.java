package Polym;

public class PolmD5 extends PolmC5 {
static void m1() {
	System.out.println("PolmD5 m1()");
}
static void m2() {
	System.out.println("PolmD5 m2()");
}
static void m4() {
	System.out.println("PolmD5 m4()");
}

public static void main(String []a) {
	System.out.println("PolmD5 Main()");
	
System.out.println("========D5 Instance ===========");
	PolmD5 b=new PolmD5();
	b.m1();
	b.m2();
	b.m3();
	b.m4();
	
	System.out.println("========C5 Instance ===========");
	
	PolmC5 c=new PolmD5();
	c.m1();
	c.m2();
	c.m3();
	
	System.out.println("========B5 Instance ===========");
	
	PolmB5 d=new PolmD5();
	d.m1();
	d.m2();
	d.m3();
	
	System.out.println("========A5 Instance ===========");
	PolmA5 e=new PolmD5();
	e.m1();
	e.m2();
	
	
	
}


}
