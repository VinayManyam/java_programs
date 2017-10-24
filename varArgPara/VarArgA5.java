package varArgPara;

import java.util.Scanner;

public class VarArgA5 {
	
	static void add(int... a) {
		
		if(a.length>0) {
		System.out.println("a.lenght:"+a.length+",a[] Values :");
		int sum=0;
		for(int j=0;j<a.length;j++) {
			System.out.println("a["+j+"]:"+a[j]);
			sum+=a[j];
		}
		System.out.println("a[] sum:"+sum);
		System.out.println("--------------------------------");
		}else System.out.println("array lenght is Zero");
	}
	
	public static void main(String[] a) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter array lenght:");
		int[] l=new int[s.nextInt()];
		
		for(int i=0;i<l.length;i++) {
			System.out.println("Enter l["+i+"]:");
			l[i]=s.nextInt();
		}
		add(l);
		System.out.println("========== anonumous array ===========");
		add(new int[]{23,32,34,54});
		
	}

}
