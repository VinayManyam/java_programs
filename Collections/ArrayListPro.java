package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListPro {
@SuppressWarnings("unchecked")
public static void main(String []a) {
	System.out.println("main()");
	ArrayList b=new ArrayList();
	System.out.println("b.size():"+b.size());
	b.add(123);
	b.add("hi");
	b.add(12.12);
	b.add(true);
	b.add("red");
	b.add("green");
	System.out.println("b.size():"+b.size());
	System.out.println("b:"+b);
	b.remove(4);
	System.out.println("b.size():"+b.size());
	System.out.println("b:"+b);
	b.remove(true);
	System.out.println("b.size():"+b.size());
	System.out.println("b:"+b);	
	String s=(String)b.get(3);
	System.out.println("b[2]->s:"+s);
	b.add(2,"pink"+"red");
	System.out.println("b:"+b);
	System.out.println("=========== Iterator =============");
	Iterator i=b.iterator();
	while(i.hasNext()) {
		Object q=i.next();
		System.out.println(q);
	}
	
	
/*	System.out.println("Enumeration class");
	Enumeration e=b.Enumeration();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		System.out.println();
	}*/
	
}
}
