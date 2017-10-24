package varArgPara;

public class VarArgB4 {
public static void main(String[] a) {
	System.out.println("VarArgB1 main()");

	System.out.println("======== add(array arg) ============");
VarArgA4.add(new int[0]);
VarArgA4.add(new int[]{1});
VarArgA4.add(new int[]{1,2});
VarArgA4.add(new int[]{1,2,3});
VarArgA4.add(new int[] {1,2,3,4});



System.out.println("======== add2(para arg) ============");
VarArgA4.add2();
VarArgA4.add2(1);
VarArgA4.add2(1,2);
VarArgA4.add2(1,2,3);
VarArgA4.add2(1,2,3,4);
}

}
