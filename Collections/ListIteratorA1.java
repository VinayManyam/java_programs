package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorA1 {
	@SuppressWarnings("unchecked")
	public static void main(String []a) {
		System.out.println("main()");
		ArrayList b=new ArrayList();
		b.add(123);
		b.add(321);
		b.add("hi");
		b.add(12.12);
		b.add(true);
		b.add("red");
		b.add("green");
		System.out.println("===========ListIterator =============");
		int count=1;
		ListIterator l=b.listIterator();
		while(l.hasNext()) {
			Object o=l.next();
			if(o instanceof String) {
				String s=(String)o;
				System.out.println("String:"+s);
				l.set(s.toUpperCase());
			}
			if(o instanceof Integer) {
				int i=(Integer)o;
			if(count==1) {
				l.add(20);
				count++;
			}
				System.out.println("Integer:"+i);
			}
		}
		System.out.println("l:"+l);
while(l.hasPrevious()) {
	Object ob=l.previous();
	System.out.println(ob);
}
	
	}

}
