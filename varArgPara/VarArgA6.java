package varArgPara;

public class VarArgA6 {
void m1(int... a) {
	System.out.println("a.lenght:"+a.length+",a[] Values :");
	for(int j=0;j<a.length;j++) {
		System.out.println("a["+j+"]:"+a[j]);
		}
	System.out.println("--------------------------------");

}	
	
}
