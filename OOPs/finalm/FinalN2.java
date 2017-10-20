package finalm;

public class FinalN2 extends FinalM2{
	
static {
	FinalN2 n=new FinalN2();
	n.m1();
	n.m2();
}
	static int m1() {
		System.out.println("FinalN2 static m1()");
		return 1;
	}
 void m2() {
	System.out.println("FinalN2 m2()");
}




}

