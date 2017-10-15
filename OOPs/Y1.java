package vin;

public class Y1 extends X1 {
	static int a=50;
	int x=60;
	
	static void m1(){
		
		System.out.println("Y1 class m1()");
	}

	void m2(){
		super.m1();
		super.m2();
		System.out.println("Y1 class m2()");
	}
	
	public static void main(String[] args) {
		System.out.println("a:"+a);
		m1();

		Y1 b=new Y1();
		System.out.println("b:"+b.x);
		b.m2();
		b.m3();
	}

}
