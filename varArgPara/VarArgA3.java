package varArgPara;

public class VarArgA3 {
	static void add(int... a) {
		System.out.println("a.lenght:"+a.length+",a[] Values :");
		for(int j=0;j<a.length;j++) {
			System.out.println("a["+j+"]:"+a[j]);
		}
		System.out.println("--------------------------------");
		
	}


}
