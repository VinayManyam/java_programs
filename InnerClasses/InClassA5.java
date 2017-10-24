package InnerClasses;

public class InClassA5 {
	void m4() {
		System.out.println("InClassA5 m4()");
	}
	static void m3() {
		System.out.println("InClassA5 m3()");
	}
	InClassA5(){
		System.out.println("InClassA5 Constractor");	
	}
static {
System.out.println("InClassA5 static block");
}
static class InClassB5{
	static void m2() {
		System.out.println("InClassB5 static m2()");	
	}
	void m1() {
		System.out.println("InClassB5 m1()");
	}
	
	InClassB5(){
		System.out.println("InClassB5 Constractor");	
	}
	static {
		System.out.println("InClassB5 static block");	
	}
	public static void main(String[] a) {
		System.out.println("InClassB5 main()");
		System.out.println("========== InClassA5 ==========");
		InClassA5 c=new InClassA5();
		InClassA5.m3();
		c.m4();
	}
	
}

public static void main(String[] a) {
	System.out.println("InClassA5 main()");
	System.out.println("========== InClassB5 ==========");
	InClassB5 b=new InClassB5();
	b.m1();
	InClassB5.m2();
	InClassB5.main(a);
	
	
	
	
}

}
