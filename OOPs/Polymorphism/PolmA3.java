package Polym;

public class PolmA3 {
	static void m1() {
		System.out.println("PolmA3 Static m1()");
	}
  private void m2() {
		System.out.println("PolmA3 m2()");
	}
	void m3() {
		System.out.println("PolmA3 m3()");
		System.out.println("------------------");
		m1();
		m2();
		
		System.out.println("------------------");
	
	}

	void m4() {
		System.out.println("PolmA3 m4()");
	}
	
	public static void main(String []a) {
		PolmA2 b=new PolmA2();
		b.m3();
		m1();
		
	}

}
