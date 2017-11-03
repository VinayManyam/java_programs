package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPro {
@SuppressWarnings("unchecked")
public static void main(String []a) {
	LinkedList b=new LinkedList();
	System.out.println("b.size():"+b.size());
	b.add(123);
	b.add("hi");
	b.add(12.12);
	b.add(true);
	b.add("red");
	b.add("green");
	System.out.println("b.size():"+b.size());
	System.out.println("b:"+b);
	b.removeFirst();
	System.out.println("b.size():"+b.size());
	System.out.println("b:"+b);
	
	
/*	System.out.println("Enumeration class");
	Enumeration e=b.element();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		System.out.println();
	}
*/	
	System.out.println("=========== Iterator =============");
	Iterator i=b.iterator();
	while(i.hasNext()) {
		Object q=i.next();
		System.out.println(q);
	}
}
}
