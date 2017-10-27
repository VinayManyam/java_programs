package FundamentalClasses;

public class Comparision {
public static void main(String[] a) {
	System.out.println("Comparision main()");
	int x=10,y=20,z=30;
	System.out.println("x:"+x+"  y:"+y+"  z:"+z);
	System.out.println("x==y:"+(x==y));
	Test t=new Test();
	Test t1=new Test();
	Test t3=t1;
	Test2 t2=new Test2();
	System.out.println("Test t==Test t1:"+(t==t1));
	System.out.println("Test t3==Test t1:"+(t3==t1));
	//System.out.println("Test2 t2==Test t1:"+(t2==t1));//Incompatible operand types Test2 and Test
	System.out.println("t.equals(t1):"+t.equals(t1));
	System.out.println("t1.equals(t3):"+t1.equals(t3));
	System.out.println("t1.equals(t2):"+t1.equals(t2));
	System.out.println("null==null:"+(null==null));
	System.out.println("t==null:"+(t==null));
	t=null;
	System.out.println("t==null:"+(t==null));
	System.out.println("t==new Test():"+(t==new Test()));
System.out.println("t1.equals(null):"+t1.equals(null));
//System.out.println("t.equals(null):"+t.equals(null));//Null pointer access: The variable t can only be null at this location
	

}
}
