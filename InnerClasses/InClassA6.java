package InnerClasses;

public class InClassA6 {
static int a=10;
int x=20;

static class InClassB6{
	static int a=30;
	int x=40;
	void m1() {
		System.out.println("InClassB6 m1() ");
		System.out.println("InClassB6 static a:"+a);
		System.out.println("InClassB6 x:"+x);
		System.out.println("========= InClassA6 Instance ============");
		InClassA6 b=new InClassA6();
		System.out.println("InClassA6 static a:"+InClassA6.a);
		System.out.println("InClassA6 x:"+b.x);
		System.out.println("========= InClassB6.m1()->InClassA6 main() ============");
		new InClassA6().m2(); //keep comments when running from InClassA6 class
	}
	public static void main(String[] a) {
		System.out.println("InClassB6 main()");
		new InClassB6().m1();
	}
	
}
void m2() {
	System.out.println("InClassA6 m2() ");
	System.out.println("InClassA6 static a:"+a);
	System.out.println("InClassA6 x:"+x);
	System.out.println("========= InClassB6 Instance ============");
	InClassB6 c=new InClassB6();
	System.out.println("InClassB6 static a:"+InClassB6.a);
	System.out.println("InClassB6 x:"+c.x);
	System.out.println("========= InClassA6.m2()->InClassB6 main() ============");	
	//new InClassB6().m1(); //keep comments when running from InClassB6 class
}

public static void main(String[] a) {
	System.out.println("InClassA6 main()");
	new InClassA6().m2();
}

}
