package vin;

public class B5 extends A5{
	static int a=50;
	int x=60;
	
	static void m1(){
	
		System.out.println("B5 class m1()");
	}

	void m2(){
	
		System.out.println("B5 class m2()");
	}
	
	
	public static void main(String[] args) {
System.out.println("a:"+a);
m1();

B5 b=new B5();
System.out.println("b:"+b.x);
b.m2();
A5.m1(10);
b.m2(10);
b.m3();
	}

}
