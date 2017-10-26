package InnerClasses;

public class LoInClass {

static int a=10;
int b=20;
private int c=30;
private int d=50;
	LoInClass(){
		System.out.println("---- LoInClass Constractor ----");
	}
	
void m1() {
	System.out.println("LoInClass m1()");
	
	
	class LoInClass2{
		LoInClass2(){
			System.out.println("---- LoInClass2 Constractor ----");
		}
		void m2() {
			System.out.println("LoInClass2 m2()");
			System.out.println("LoInClass NsInClass.a:"+a);
			System.out.println("LoInClass NsInClass.b:"+b);
			System.out.println("LoInClass NsInClass.c:"+c);
			System.out.println("LoInClass NsInClass.d:"+d);
		}
		
	}

	LoInClass2 l=new LoInClass2();
	l.m2();
	
}
void m4() {
	System.out.println(" LoInClass m4()");
}
LoInterface m3() {
	class LoInClass3 implements LoInterface{
		
		LoInClass3(){
			System.out.println("LoInClass3 Constractor");
		}
		int y=20;
		
		public void m4() {
			int x=10;
			System.out.println("LoInClass3 m4()");
			System.out.println("LoInClass3 m4().x:"+x);
			System.out.println("LoInClass3 m4().y:"+y);
			
		}
	}
	LoInClass3 l=new LoInClass3();
	l.m4();
	m5(l);
	return l;
}
void m5(LoInterface e) {
	System.out.println("-------- LoInClass m5() -------------");
	e.m4();
}

public static void main(String[] s) {
	System.out.println("------  LoInClass main() --------");
	LoInClass l=new LoInClass();
	l.m1();
	l.m3();


	
	
}

}
