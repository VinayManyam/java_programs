package StringHandling;

public class StrFormates {
public static void main(String[] a) {
	String s="Hello";
	System.out.println(s);
	String s1=new String();
	System.out.println("s1:"+s1);
	String s2=s+" 1";
	System.out.println("s2:"+s2);
	String s3=new String("Hello 2");
	System.out.println(s3);
	char[] c= {'h','e','l','l','o',' ','3'};
	String s4=new String(c);
	System.out.println("s4:"+s4);
	String s6=new String(c,2,3);
	System.out.println("s6:"+s6);
	byte[] d= {97,98,99,100};
	String s5=new String(d);
	System.out.println("s5:"+s5);
	String s7=new String(d,1,2);
	System.out.println("s7:"+s7);	
}
}
