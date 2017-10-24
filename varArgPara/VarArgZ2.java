package varArgPara;

public class VarArgZ2 extends VarArgY2{
public static void main(String[] s) {
	System.out.println("VarArgZ1 main()");
	System.out.println("=========== VarArgX1 Instance =============");
	VarArgX2 x=new VarArgX2();
	x.m1(new int[] {});
	x.m1(new int[] {1,2});
	x.m1(new int[] {5});
	System.out.println("=========== VarArgY1 Instance =============");
	
	VarArgY2 y=new VarArgZ2();
	y.m1();
	y.m1(12);
	y.m1(new int[] {});
	y.m1(new int[] {1,2});
	
	
}
}
