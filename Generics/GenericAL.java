package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericAL {
public static void main(String []a) {
	ArrayList<String> l=new ArrayList<String>();
	l.add("a");
	l.add("b");
	l.add("c");
	l.add("d");
	l.add("e");
	System.out.println("l:"+l);
	Iterator<String> i= l.iterator();
	while(i.hasNext()) {
		String s=i.next();
		System.out.println(s.toUpperCase());
	}
	System.out.println("=======================");
	Iterator i1= l.iterator();
	while(i1.hasNext()) {
		String s=(String)i1.next();
		System.out.println(s.toUpperCase());
	}	
}
}
