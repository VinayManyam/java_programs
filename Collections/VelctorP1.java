package Collections;

import java.util.Vector;

public class VelctorP1 {
@SuppressWarnings("unchecked")
public static void main(String []a) {
	Vector v=new Vector();
	for(int i=0;i<=9;i++) {
		v.addElement(new Integer(i*10));
	}
	System.out.println("v:"+v);
	v.removeElementAt(0);
	System.out.println("v:"+v);
	for(int i=0;i<v.size();i++) {
		System.out.println(v.elementAt(i));
	}
}
}
