package varArgPara;

public class VarArgA8 {
static void m1(String... a) {
	System.out.println("a.lenght:"+a.length+",a[] Names :");
	for(int j=0;j<a.length;j++) {
		System.out.println("a["+j+"]:"+a[j]);
		}
	System.out.println("--------------------------------");

}	
	
}
