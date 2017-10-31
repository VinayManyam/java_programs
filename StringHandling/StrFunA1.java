package StringHandling;

public class StrFunA1 {
public static void main(String []a) {
	System.out.println("StrFunA1 main()");
	
	String s="Hello World,java programming Language";
	String s1="";
	String s2=null;
	String s3=new String();
	String s4=new String("");
	String s5="abc";
	String s6="ABC";
	String s7="abc";
	String s8="abcdefg";
	String s9="adc";
/*	System.out.println("s.Empty():"+s.isEmpty());
	System.out.println("s1.Empty():"+s1.isEmpty());
	//System.out.println("s2.Empty():"+s2.isEmpty());//java.lang.NullPointerException
	System.out.println("s3.Empty():"+s3.isEmpty());
	System.out.println("s4.Empty():"+s4.isEmpty());
	System.out.println("s.length():"+s.length());
	System.out.println("s1.length():"+s1.length());
	System.out.println("s3.length():"+s3.length());
	System.out.println("s5.equals(s6):"+s5.equals(s6));
	System.out.println("s5.equalsIgnoreCase(s6):"+s5.equalsIgnoreCase(s6));
	System.out.println("s7.compareTo(s8):"+s7.compareTo(s8));
	System.out.println("s9.compareTo(s7):"+s9.compareTo(s7));
	
	//startswith,endsWith
	System.out.println("s.startsWith(\"Hello\"):"+s.startsWith("Hello"));
	System.out.println("s.endsWith(\"Language\"):"+s.endsWith("Language"));
	//charAt
	System.out.println("s.charAt(10):"+s.charAt(10));
	for(int i=0;i<s.length();i++) {
		System.out.println("s["+i+"]:"+s.charAt(i));
	}
	
	System.out.println("s.indexOf(\"Hello\"):"+s.indexOf("Hello"));
	System.out.println("s.indexOf('o'):"+s.indexOf('o'));
	System.out.println("s.lastIndexOf('o'):"+s.lastIndexOf('o'));
	System.out.println("s.indexOf('o',5):"+s.indexOf('o',5));
	System.out.println("s.lastIndexOf('o',5):"+s.lastIndexOf('o',5));
	System.out.println("s.indexOf('z'):"+s.indexOf('z'));

	//substring()
	System.out.println("s.substring(5):"+s.substring(15));
	System.out.println("s.substring(5,20):"+s.substring(5,20));
	System.out.println("s.substring(5,5):"+s.substring(5,5));
	//System.out.println("s.substring(15,10):"+s.substring(15,14));
	
	String c1="a";
	String c2="b";
	String c3="a"+"b";
	String c4=c1+c2;
	String c5=c1.concat(c2);
	System.out.println("c3==c4:"+(c3==c4));
	System.out.println("c3.equals(c4):"+c3.equals(c4));
	System.out.println("c3==c5:"+(c3==c5));
	System.out.println("c3.equals(c5):"+c3.equals(c5));
	System.out.println("c5==c4:"+(c5==c4));
	System.out.println("c5.equals(c4):"+c5.equals(c4));
	
//str repalce
	System.out.println("s.toLowerCase():"+s.toLowerCase());
	System.out.println("s.toUpperCase():"+s.toUpperCase());
	String r1=s.replace('o','O');
	System.out.println("s.replace(o,O):"+r1);
	String r2=s.replace("java","JAVA");
	System.out.println("s.replace(\"java\",\"JAVA\"):"+r2);
	
		*/
	String s10="  abc  def  ";
	System.out.println("s10.lenght():"+s10.length());
	System.out.println("s10.trim():"+s10.trim());
	System.out.println("s10.lenght():"+s10.trim().length());
	
	String[] arr=s.split(" ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+",");
	}
	
	
	
}
}
