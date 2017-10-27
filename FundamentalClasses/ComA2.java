package FundamentalClasses;

public class ComA2 {
public static void main(String[] a) {
	Student2 s1=new Student2(1,"abc",123);
	Student2 s2=new Student2(1,"abc",123);
	System.out.println("s1.hashCode():"+s1.hashCode());
	System.out.println("s2.hashCode():"+s2.hashCode());
	System.out.println("s1.equals(s2):"+s1.equals(s2));
	System.out.println("s1.HashCode()==s2.HashCode():"+(s1.hashCode()==s2.hashCode()));
}
}
