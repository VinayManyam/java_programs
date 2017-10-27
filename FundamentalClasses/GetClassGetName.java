package FundamentalClasses;

public class GetClassGetName {
public static void main(String[] s) {
	System.out.println("GetClassGetName main()");
	GetClassGetName g=new GetClassGetName();
	System.out.println("GetClassGetName object:"+g.getClass());
	G1.m1(g);
	System.out.println("G1 object:");
	G1 b=new G1();
	G1.m1(b);
	System.out.println("String c:");
	String c="abc";
	G1.m1(c);
	
	int d=1234;
	System.out.println("Integer d:");
	G1.m1(d);
	
	Object e=new Test();
	System.out.println("Object Test.e:");
	G1.m1(e);
	
	Test f=new Test();
	System.out.println("Test.f:");
	G1.m1(f);
	
	Test h=new Test3();
	System.out.println("Test.h:");
	G1.m1(h);
	
	
}
}
