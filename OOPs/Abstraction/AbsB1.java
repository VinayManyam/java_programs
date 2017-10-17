package abs;

public class AbsB1 extends AbsA1 {

	void m1() {
		System.out.println("it is m1() method imp for Abstract class AbsA1");
	}
	
	void m2(int x) {
		System.out.println("it is m2(arg) method in AbsB1 class");
	}
	public static void main(String[] a) {
		AbsB1 a1=new AbsB1();
		a1.m1();
		a1.m2(10);
		a1.m2();
	}
}
