package Collections;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTablePro {
@SuppressWarnings("unchecked")
public static void main(String []a) {
	Hashtable h=new Hashtable();
	h.put("A",new Double(1000));
	h.put("B",new Double(2000));
	h.put("c",new Double(3000));
	h.put("D",new Double(4000));

	System.out.println("h:"+h);
	System.out.println("========== Enumeration ==========");
	Enumeration e=h.keys();
	while(e.hasMoreElements()) {
		String key=(String)e.nextElement();
		System.out.println(key+" "+h.get(key));
		}
	
	
	
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
	System.out.println("====================================");
	Double balance=((Double)h.get("D")).doubleValue();
	System.out.println("D balance:"+h.get("D"));
	h.put("D", new Double(balance+2000));
	System.out.println("D new balance:"+h.get("D"));

	
}
}
