package arrayobject;


public class ArrayObj {
	static int []c= {0,2,3};
	static int[] d=new int[5];
	int[] a= {0,1};
	static void m1(int[] a) {}
public static void main(String[] a) {
	int[] b= {0,1};
	int[] i=new int[5];
	int[] i1=new int[1];
	ArrayObj n=new ArrayObj();
	System.out.println(b.length);
	System.out.println(n.a.length);
	System.out.println(c.length);
	System.out.println(d.length);
	m1(new int[] {0,1,2});//anonymous array
	

}
}
