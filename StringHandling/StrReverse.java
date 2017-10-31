package StringHandling;

import java.util.Scanner;

public class StrReverse {
public static String reverseStringWord(String s) {
	String []a=s.split(" ");
	
	String result="";
	for(int i=a.length-1;i>=0;i--) {
		result+=a[i]+" ";
	}
	return result;
}
public static void main(String []a) {
	System.out.println("StrReverse main()");
	Scanner s=new Scanner(System.in);
	System.out.println("enter santance:");
	String str=s.nextLine();
	System.out.println(str);
	String str1=StrReverse.reverseStringWord(str);
	System.out.println("Reverse String:"+str1);
}
}

