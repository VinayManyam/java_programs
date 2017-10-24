package varArgPara;

import java.util.Scanner;

public class VarArgB8 {
public static void main(String[] a) {

	Scanner s=new Scanner(System.in);
	System.out.println("enter names with space separator:");
	String S=s.nextLine();

	if(S.isEmpty()) {
		VarArgA8.m1();
	}else {
		String[] names=S.split(" ");
		VarArgA8.m1(names);
			}
	}
	


}


