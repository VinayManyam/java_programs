package Polym;

public class PolmB4 extends PolmA4{
void m1() {
	System.out.println("PolmB4 m1()");
}
void m3() {
	System.out.println("PolmB4 m3()");
System.out.print("POlmB4 m3()->m1():");
m1();

System.out.print("POlmB4 m3()->m2():");
super.m2();
}

public static void main(String []a) {
	PolmB4 b=new PolmB4();
	b.m1();
	b.m2();
	b.m3();
}
}
