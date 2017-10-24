package arrayobject;

public class ArrC1 {
	static int[] i1= new int[5];
	int[] i2= {10,20,30,40};
public static void main(String[] a) {
	ArrA1[] e= {new ArrA1(),new ArrA1(),new ArrA1(),new ArrA1()};
	ArrB1.m2(e);
	for(int j=0;j<e.length;j++) {
		System.out.println("e["+j+"].x:"+e[j].x);
		System.out.println("e["+j+"].y:"+e[j].y);
		System.out.println("=========================");
	}
	int[] i3= new int[5];
	System.out.println("i1[1]:"+i1[1]);
	//System.out.println("i2"+i2[1]);
	ArrC1 c=new ArrC1();
	System.out.println("i2[1]:"+c.i2[1]);
	System.out.println("i3[1]:"+i3[1]);
	
}
}
