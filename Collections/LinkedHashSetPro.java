package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPro {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String []a) {
		LinkedHashSet h=new LinkedHashSet();
		System.out.println("h:"+h.size());
		h.add(12);
		h.add(true);
		h.add(123);
		h.add("hi");
		h.add(null);
		h.add(12.12);
		h.add(true);
		h.add("red");
		h.add("green");
		h.add(new Example());
		h.add(new String("hi"));
		System.out.println("h.size:"+h.size());
		System.out.println("h:"+h);
		
		System.out.println("=========== Iterator =============");
		Iterator i=h.iterator();
		while(i.hasNext()) {
			Object q=i.next();
			System.out.println(q);
		}
	}
}
