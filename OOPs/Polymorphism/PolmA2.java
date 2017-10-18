package Polym;

public class PolmA2 {
	static void m1() {
		System.out.println("PolmA2 Static m1()");
	}
   void m2() {
		System.out.println("polmA2 m2()");
	}
	void m3() {
		System.out.println("polmA2 m3()");
		System.out.println("------------------");
		m1();
		m2();
		this.m2();
		System.out.println("------------------");
	
	}

	void m4() {
		System.out.println("polmA2 m4()");
	}
	
	public static void main(String []a) {
		PolmA2 b=new PolmA2();
		b.m3();
		m1();
		
	}
}
