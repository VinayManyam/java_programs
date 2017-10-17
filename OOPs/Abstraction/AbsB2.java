package abs;

public class AbsB2 extends AbsA2 {
static int b=30;
int y=40;
 
static {
	System.out.println("ABsB2 static block");
	}

{
System.out.println("AbsB2 Block");	
}
AbsB2(){
	super();
	System.out.println("AbsB2 constructor");
}

void m5() {
	System.out.println("AbsB2 m5() method");
}

static void m4() {
	System.out.println("AbsB2 static  m4() method");
}
void m1() {
	System.out.println("AbsB2 m1() ");
}

public static void main(String []a) {
	System.out.println("AbsB2 Main()");
	System.out.println("a:"+AbsA2.a);
	System.out.println("b:"+b);
	AbsA2.m2();
	m4();
	
	AbsB2 b=new AbsB2();
	b.m1();
	b.m5();
	AbsA2 c=new AbsB2();
	c.m3();

	
	
	
	
}


}
