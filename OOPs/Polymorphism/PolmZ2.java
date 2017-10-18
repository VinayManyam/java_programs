package Polym;


public class PolmZ2 extends PolmY2{

public static void main(String []a) {
	System.out.println("========Y2 Instance ==========");
	PolmY2 y=new PolmY2();
	y.m1(123);
	y.m1(2.2);
	System.out.println("PolmY2 y:"+PolmY2.y);
	System.out.println("========X2 Instance ==========");
	PolmX2 x=new PolmY2();
	//x.m1(2.2);
	x.m1(1);
	System.out.println("PolmX2 y:"+PolmX2.y);

}
}
