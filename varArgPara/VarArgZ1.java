package varArgPara;

public class VarArgZ1 extends VarArgY1{
public static void main(String[] s) {
	System.out.println("VarArgZ1 main()");
	System.out.println("=========== VarArgX1 Instance =============");
	VarArgX1 x=new VarArgZ1();
	x.m1();
	x.m1(12);
	x.m1(12L);
	System.out.println("=========== VarArgY1 Instance =============");
	
	VarArgY1 y=new VarArgZ1();
	y.m1();
	y.m1(12);
	y.m1(12L);
	
}
}
