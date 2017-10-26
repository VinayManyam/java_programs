package InnerClasses;

public class LoInClassA1 {
static int a=10;
int b=20;
static void m1(final int c,int d) {
	final int e=30;
	int f=40;
	class LoInClassB1{
void m1() {
	System.out.println("LoInClassA1.a:"+a);
	//System.out.println("LoInClassB1 ma().b:"+b);
	System.out.println("LoInClassB1.m1().b:"+c);
	System.out.println("LoInClassB1.m1().d:"+d);
	System.out.println("LoInClassB1.m1().e:"+e);
	System.out.println("LoInClassB1.m1().f:"+f);
	
		}

	}
	 LoInClassB1 b=new  LoInClassB1();
	 b.m1();

}
void m2() {
	class LoInClassC1{
		void m2() {
			System.out.println("LoInClassC1 m2().a:"+a);
			System.out.println("LoInClassC1 m2().b:"+b);
		}
	}
	LoInClassC1 c=new LoInClassC1();
	c.m2();
}
	
}
