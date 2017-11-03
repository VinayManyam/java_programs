package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorCapacity {
public static void main(String []a) {
	Vector v=new Vector();
	System.out.println("capacity:"+v.capacity());
	System.out.println("size:"+v.size());
	Customer c1=new Customer("a",12,new Address("12-12","srn","hyd","1234"));
	Customer c2=new Customer("b",13,new Address("12-121","srn2","hyd","1234"));
	Customer c3=new Customer("c",14,new Address("12-1212","srn3","hyd","1234"));
	Customer c4=new Customer("d",15,new Address("12-12123","srn4","hyd","1234"));
	Customer c5=new Customer("e",13,new Address("12-121345","srn5","hyd","1234"));
	v.add(c1);
	System.out.println("capacity:"+v.capacity());
	System.out.println("size:"+v.size());	
	v.add(c2);
	System.out.println("capacity:"+v.capacity());
	System.out.println("size:"+v.size());
	v.add(c3);
	v.add(c4);
	v.add(c5);
	System.out.println("capacity:"+v.capacity());
	System.out.println("size:"+v.size());
	v.add(123);
	v.add(1234);
	v.add(12345);
	v.add(123456);
	v.add(1234567);
	v.add(12345678);
	System.out.println("============================");
	System.out.println("capacity:"+v.capacity());
	System.out.println("size:"+v.size());
	System.out.println("============================");
	System.out.println("Enumeration class");
	Enumeration e=v.elements();
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
		System.out.println();
	}
	
	System.out.println("=========== Iterator =============");
	Iterator i=v.iterator();
	while(i.hasNext()) {
		Object q=i.next();
		System.out.println(q);
	}
	
	
}
}
