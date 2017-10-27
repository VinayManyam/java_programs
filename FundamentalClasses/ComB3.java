package FundamentalClasses;

public class ComB3 {

public static void main(String[] a) {
	ComA3 b=new ComA3(3);
	ComA3 b1=new ComA3(4);
	ComA3 b2=new ComA3(3);
	
	System.out.println("b.hashCode():"+b.hashCode());
	System.out.println("System.identityHashCode(b):"+System.identityHashCode(b));
	System.out.println("b.JVMHC():"+b.JVMHC());
	System.out.println("b1.hashCode():"+b1.hashCode());
	System.out.println("System.identityHashCode(b1):"+System.identityHashCode(b1));
	System.out.println("b1.JVMHC():"+b1.JVMHC());
	System.out.println("b2.hashCode():"+b2.hashCode());
	System.out.println("System.identityHashCode(b2):"+System.identityHashCode(b2));
	System.out.println("b2.JVMHC():"+b2.JVMHC());
	
	
	
	
	
}
}
