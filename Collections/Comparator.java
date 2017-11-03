package Collections;
//shorting objects
import java.util.TreeSet;

public class Comparator {
@SuppressWarnings("unchecked")
public static void main(String []s) {
	
TreeSet b=new TreeSet();
b.add("B");
b.add("D");
b.add("A");
b.add("C");
b.add("E");
System.out.println(b);
TreeSet b1=new TreeSet(new StringComparator());
b1.add("F");
b1.add("A");
b1.add("B");
b1.add("C");
b1.add("D");
b1.add("a");


System.out.println("b1:"+b1);



}
}
