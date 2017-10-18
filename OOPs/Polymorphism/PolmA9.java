package Polym;

public class PolmA9 {
static void m1(int i) {
	System.out.println("Int arg");
}
static void m1(float f) {
	System.out.println("flaot arg");
}
public static void main(String []a) {
	m1(3);
	m1((float)3/2);
	m1(10L);
	long L=10;
	m1(L);
	
}
}
