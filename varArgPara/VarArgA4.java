package varArgPara;
//Addition with Array parameters ,var-arg para
public class VarArgA4 {
	
	
	static void add(int[] a) {
		System.out.println("a.lenght:"+a.length+",a[] Values :");
		int sum=0;
		for(int j=0;j<a.length;j++) {
			System.out.println("a["+j+"]:"+a[j]);
			sum+=a[j];
		}
		System.out.println("a["+a.length+"] sum:"+sum);
		System.out.println("--------------------------------");
		
	}
	static void add2(int... a) {
		System.out.println("a.lenght:"+a.length+",a[] Values :");
		int sum=0;
		for(int j=0;j<a.length;j++) {
			System.out.println("a["+j+"]:"+a[j]);
			sum+=a[j];
		}
		System.out.println("a["+a.length+"] sum:"+sum);
		System.out.println("--------------------------------");
		
	}


}
