package Polym;

public class PolmA4 {
private void m1() {
	System.out.println("PolmA4 m1()");
}
void m2() {
	System.out.println("PolmA4 m2()");
	System.out.print("PolmA4 m2()->m1():");
	m1();
}

}
