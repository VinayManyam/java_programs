package InnerClasses;

import InnerClasses.NsInClass.NsInClass2;

public class NsInClass3 {
public static void main(String[] a) {
	System.out.println("NsInClass3 main()");
	System.out.println("=========== NsInClass Instance ===========");
	NsInClass b=new NsInClass();
	//b.main(a);
	b.m1();
	System.out.println("=========== NsInClass.NsInClass2 Instance ===========");
	NsInClass.NsInClass2 m=new NsInClass().new NsInClass2();
	m.m1();
	
}
}
