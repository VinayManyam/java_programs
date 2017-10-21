package objects;

public class ObjA1 {
	int x=123;
	static int y=321;
ObjA1 e1,e2;
static ObjA1 e5,e6;
public static void main(String []a) {
	System.out.println("ObjA1 main()");
	ObjA1 e3,e4;
	ObjA1 e7=new ObjA1();
	System.out.println("static object e5:"+e5);
	System.out.println("static object e6:"+e6);
	e3=new ObjA1();
	e3.e2=new ObjA1();
	e3.e2.e1=new ObjA1();
	e4=null;

	System.out.println("================ Local Object ===================");
	System.out.println("local object e4:"+e4);
	System.out.println("local object e3:"+e3);
	System.out.println("local object e7:"+e7);
	System.out.println("local object e7.toString :"+e7.toString());
	System.out.println("local object e7.x:"+e7.x);
	System.out.println("local object e7.y:"+e7.y);
	System.out.println("local object e7.e1:"+e7.e1);
	System.out.println("local object e7.e2:"+e7.e2);
	
	
	System.out.println("=============== Non-Static ===============");
	System.out.println("Non-static object e3.e2:"+e3.e2);
	System.out.println("Non-static e3.e2.x:"+e3.e2.x);
	System.out.println("Non-static e3.e2.y:"+e3.e2.y);
	System.out.println("Non-static e3.e2.e1:"+e3.e2.e1);
	System.out.println("Non-static e3.e2.e1.x:"+e3.e2.e1.x);
	System.out.println("Non-static e3.e2.e1.y:"+e3.e2.e1.y);
	System.out.println("Non-static e3.e2.e2:"+e3.e2.e2);
	System.out.println("Non-static e3.e2.e1.e1:"+e3.e2.e1.e1);
	System.out.println("Non-static e3.e2.e1.e2:"+e3.e2.e1.e2);
	System.out.println("================ Static Object ================");
	e5=new ObjA1();
	e5.e1=new ObjA1();
	System.out.println("static object:"+e5);
	System.out.println("static object: e5.x:"+e5.x);
	System.out.println("static object: e5.y:"+e5.y);
	System.out.println("static object: e5.e1:"+e5.e1);
	System.out.println("static object: e5.e1.e1:"+e5.e1.e1);
	System.out.println("static object: e5.e1.e2:"+e5.e1.e2);
	System.out.println("static object: e5.e1.e5:"+e5.e1.e5);
	System.out.println("static object: e5.e1.e6:"+e5.e1.e6);
	System.out.println("static object: e5.e1.x:"+e5.e1.x);
	System.out.println("static object: e5.e1.y:"+e5.e1.y);
	System.out.println("static object: e5.e2:"+e5.e2);
	System.out.println("static object: e5.e6:"+e5.e6);
	System.out.println("=========================================");
	
		
}
}
