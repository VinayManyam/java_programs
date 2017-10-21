package objects;

public class ObjB2 extends ObjA2{
public static void main(String []a) {
	System.out.println("ObjB2 main()");
	
	//Unreferenced Object Access
		System.out.println("ObjA2 Object:"+new ObjA2());
	System.out.println("ObjA2 x:"+new ObjA2().x);
	System.out.println("ObjA2 y:"+new ObjA2().y);
	new ObjA2().m1();
}
}
