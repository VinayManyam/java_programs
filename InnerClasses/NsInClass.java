package InnerClasses;

public class NsInClass {
	NsInClass() {
	System.out.println("NsInClass Constractor");
}
	static int a=10;
	int b=20;
	private int c=30;
	private int d=50;
class NsInClass2{
	private int d=40;
	NsInClass2(){
		System.out.println("NsInClass2 Constractor");
		System.out.println("======= NsInClass instance from NsInClass2 ==========");
		NsInClass n=new NsInClass();
		n.m1();
		System.out.println("======================================================");
	
	}
	void m1() {
		System.out.println("NsInClass2 m1()");
		System.out.println("NsInClass2 NsInClass.a:"+a);
		System.out.println("NsInClass2 NsInClass.b:"+b);
		System.out.println("NsInClass2 NsInClass.c:"+c);
		System.out.println("NsInClass2 NsInClass.d:"+d);
		
			}
		
}
void m1() {
	System.out.println("NsInClass m1()");
	System.out.println("NsInClass a:"+a);
	System.out.println("NsInClass b:"+b);
	System.out.println("NsInClass c:"+c);
	System.out.println("NsInClass d:"+d);
	//System.out.println("NsInClass2 NsInClass.d:"+new NsInClass().new NsInClass2().d);

	
}
public static void main(String[] a) {
	System.out.println("NsInClass main()");
	NsInClass.NsInClass2 m=new NsInClass().new NsInClass2();
	m.m1();
	System.out.println("NsInClass2 d:"+m.d);
	System.out.println("============================================");
	new NsInClass().new NsInClass2().m1();
	System.out.println("NsInClass2 d:"+	new NsInClass().new NsInClass2().d);
	
	
	
}

}
