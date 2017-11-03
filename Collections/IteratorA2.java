package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorA2 {
	@SuppressWarnings("unchecked")
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
		
		
		Iterator i=h.iterator();
	//	i.remove(); java.lang.IllegalStateException
		Object o=i.next();
		System.out.println(o);
		i.remove();
		System.out.println("=========== Iterator =============");
		while(i.hasNext()) {
			Object q=i.next();
			if(q instanceof String) {
				String s=((String)q).toUpperCase();
				System.out.println("string:"+s);
			}else {
				System.out.println("object:"+q);
			}
		}
	}
}
