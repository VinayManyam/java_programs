package Collections;

import java.util.Comparator;

public class StringComparator implements Comparator {


	public int compare(Object o, Object p) {
		String s,s1;
		s=(String)o;
		s1=(String)p;
		return s1.compareTo(s);
	}

}
