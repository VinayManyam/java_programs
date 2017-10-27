package FundamentalClasses;

public class HashCode {
public static void main(String[] a) {
	HashCode h=new HashCode();
	HashCode h1=new HashCode();
	HashCode h2=h1;
	System.out.println("HashCode.h :"+h.hashCode());
	System.out.println("HashCode.h1:"+h1.hashCode());
	System.out.println("h1==h:"+(h1==h));
	System.out.println("h1.equals(h):"+h1.equals(h));
	System.out.println("h1.hashcode()==h.hashcode():"+(h1.hashCode()==h.hashCode()));
	System.out.println("h1==h2:"+(h1==h2));
	System.out.println("h1.equals(h2):"+h1.equals(h2));
	System.out.println("h1.hashcode()==h2.hashcode():"+(h1.hashCode()==h2.hashCode()));
	
	Student s1=new Student(1,"abc",123);
	Student s2=new Student(1,"abc",123);
	System.out.println("s1.equals(s2):"+s1.equals(s2));
	System.out.println("s1.HashCode()==s2.HashCode():"+(s1.hashCode()==s2.hashCode()));
	
}
}
