package Collections;

public class SBComparator implements java.util.Comparator{


	public int compare(Object s, Object t) {
		StringBuffer s1=(StringBuffer)s;
		StringBuffer t1=(StringBuffer)t;
		String s2=s1.toString();
		String t2=t1.toString();
		return t2.compareTo(s2);
	}

}
