package App;

import java.util.HashSet;

public class School {
@SuppressWarnings("unchecked")
public static void main(String []a) {
	HashSet h=new HashSet();
	h.add(new Student(1,"vinay",1));
	h.add(new Student(2,"vinay2",2));
	h.add(new Student(3,"vinay3",33));
	h.add(new Student(4,"vinay4",444));
	h.add(new Integer(8));
	h.add(new String("test"));
	System.out.println("h:"+h);
	h.remove(new Integer(8));
	System.out.println("h:"+h);
	h.remove(new Student(3,"vinay3",33));
	System.out.println("h:"+h);
}
}
