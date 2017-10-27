package FundamentalClasses;

public class ComA1 {

public static void main(String[] a) {
	Student s1=new Student(1,"abc",123);
	Student s2=new Student(12,"abcd",1234);
	Student s3=new Student(1,"abc",123);
	Student s4=s3;
	Student s5=null;
	
	System.out.println("s1==s2:"+(s1==s2));
	System.out.println("s1.equals(s2):"+(s1.equals(s2)));
	System.out.println("s1==s3:"+(s1==s3));
	System.out.println("s1.equals(s3):"+(s1.equals(s3)));
	System.out.println("s3==s4:"+(s4==s3));
	System.out.println("s4.equals(s3):"+(s4.equals(s3)));
System.out.println("s4.equals(s5):"+s4.equals(s5));
}
}
