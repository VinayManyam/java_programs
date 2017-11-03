package Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPro {

@SuppressWarnings("unchecked")
public static void main(String []a) {
	TreeSet h=new TreeSet();
	TreeSet b=new TreeSet();
	System.out.println("h:"+h.size());
	h.add(12);
h.add(21);
h.add(32);
b.add("red");
b.add("green");
b.add("blue");
//b.add(new Example());
	System.out.println("h.size:"+h.size());
	System.out.println("h:"+h);
	System.out.println("b.size:"+b.size());
	System.out.println("b:"+b);

	System.out.println("=========== Iterator =============");
	Iterator i=b.iterator();
	while(i.hasNext()) {
		Object q=i.next();
		System.out.println(q);
	}
	
	
}
}
