package finalm;

public class FinalN1 extends FinalM1{
	void m1() {
		System.out.println("FinalN1 m1()");
	}

	final void m2(int a) {
		System.out.println("FinalN1 m2() int para");
	}
	final void m2(String s) {
		System.out.println("FinalN1 m2() final string para");
	}
	void m3() {
			System.out.println("FinalN1 m3()");
	}
	public static void main(String []a) {
		System.out.println("========= FinalN1 Instance ==========");
		FinalN1 f=new FinalN1();
		f.m1();
		f.m2();
		f.m2(10);
		f.m2("a");
		f.m3();
		System.out.println("========= FinalM1 Instance ==========");
		FinalM1 m=new FinalN1();
		m.m1();
		m.m2();
		m.m2("b");
		m.m2(10); 
		m.m3();
	}
}
