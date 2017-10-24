package varArgPara;

import java.util.Scanner;

public class VarArgB7 {
public static void main(String[] a) {

	Scanner s=new Scanner(System.in);
	System.out.println("enter array values with space separator:");
	String S=s.nextLine();
//System.out.println(S);	
int []num=null;
if(S.isEmpty()) {
	num=new int[0];
}else {
	String[] snums=S.split(" ");
	num=new int[snums.length];
	if(snums.length!=0) {
		for(int j=0;j<snums.length;j++) {
			num[j]=Integer.parseInt(snums[j]);
		}
		}
} 
VarArgA7 v=new VarArgA7();

v.m1(num);

}

}
