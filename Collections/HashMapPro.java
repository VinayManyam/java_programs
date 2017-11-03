package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPro {
@SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String []a) {
	HashMap h=new HashMap();
	h.put("A", "Apple");
	h.put("B", "Bat");
	h.put("c", "car");
	h.put("E", "Elephant");
	
	System.out.println("h:"+h);
	System.out.println("========== keys ==============");
	Set s=h.keySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		Object q=i.next();
		System.out.println(q);
	}
	
	System.out.println("============= values ============");
	Collection s1=h.values();
	Iterator i1=s1.iterator();
	while(i1.hasNext()) {
		Object q=i1.next();
		System.out.println(q);
	}
	
	System.out.println("========= Entrieys  ==============");
	Set s2=h.entrySet();
	Iterator i2=s2.iterator();
	while(i2.hasNext()) {
		Map.Entry me=(Map.Entry)i2.next();
		System.out.println(me.getKey()+":"+me.getValue());
	}
	
	
	
	
	
	
	
	
	
	
}
}
