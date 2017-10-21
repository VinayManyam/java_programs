package objects;

public class ObjB3 extends ObjA3 {

	public static void main(String []a) 
	{
		ObjA3 b=new ObjA3();
		ObjA3 c=new ObjA3();
		System.out.println("======== Case 1 =========");
	b.m1(b);
	b.m1(b);
	System.out.println("======== Case 2 =========");
	c.m1(new ObjA3());
	c.m1(new ObjA3());

	System.out.println("======== Case 3 =========");
	new ObjA3().m1(new ObjA3());
	new ObjA3().m1(new ObjA3());
	
	}
}
