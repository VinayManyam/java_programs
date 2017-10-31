package StringHandling;

public class StrA1 {
public static void main(String []a) {
	System.out.println("StrA1 main()");
	String s1="a";
	String s2="a";
	String s5="b";
	String s6="a"+"b";
	String s7="ab";
	String s8=s1+s5;
	System.out.println("s1==s2:"+(s1==s2));
	String s3=new String("a");
	String s4=new String("a");
	System.out.println("s1==s3:"+(s1==s3));
	System.out.println("s3==s4:"+(s3==s4));
	System.out.println("s3.equal(s4):"+(s3.equals(s4)));
	System.out.println("s1.equal(s4):"+(s1.equals(s4)));
	System.out.println("s7==s6:"+(s7==s6));
	System.out.println("s7.equal(s6):"+(s7.equals(s6)));
	System.out.println("s8==s6:"+(s8==s6));
	System.out.println("s8.equal(s6):"+(s8.equals(s6)));
	
}
}
