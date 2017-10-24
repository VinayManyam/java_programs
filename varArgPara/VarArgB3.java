package varArgPara;

public class VarArgB3 {
public static void main(String[] a) {
	System.out.println("VarArgB1 main()");
	System.out.println("======== add(para arg) ============");
	VarArgA3.add();
	VarArgA3.add(1);
	VarArgA3.add(1,2);
	VarArgA3.add(1,2,3);
	VarArgA3.add(1,2,3,4);	
	
	System.out.println("======== add(array arg) ============");
VarArgA3.add(new int[0]);
VarArgA3.add(new int[]{1});
VarArgA3.add(new int[]{1,2});
VarArgA3.add(new int[]{1,2,3});
VarArgA3.add(new int[]{1,2,3,4});
}

}
