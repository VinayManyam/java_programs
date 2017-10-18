package Polym;

public class PolmC4 extends PolmB4 {
void m2() {
	System.out.println("PolC4 m2()");
	System.out.print("PolC4 m2()->m3()");
	m3();
}
/*void m1() {
	System.out.println("PolC4 m1()");
}
*/
public static void main(String []a) {
	PolmC4 c=new PolmC4();
	System.out.println("=========C4 Instance ==========");
	c.m2();
	
}
	
	
}
