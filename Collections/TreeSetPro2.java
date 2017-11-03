package Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPro2 {

@SuppressWarnings("unchecked")
public static void main(String []a) {

	TreeSet b=new TreeSet();


b.add(new Example2(5));
b.add(new Example2(5));
System.out.println("b:"+b);

	System.out.println("=========== Iterator =============");
	Iterator i=b.iterator();
	while(i.hasNext()) {
		Object q=i.next();
		System.out.println(q);
	}
	
	
}
}
