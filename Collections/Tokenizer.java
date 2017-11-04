package Collections;

import java.util.StringTokenizer;

public class Tokenizer {
public static void main(String []a) {
	String str="vinay kuamr manyam from EastGodavari";
	StringTokenizer sf=new StringTokenizer(str,"a",true);
	System.out.println("str"+str);
		while(sf.hasMoreElements()) {
		System.out.print(sf.nextElement()+"-");
	}
		System.out.println();
	StringTokenizer s1=new StringTokenizer(str);
	while(s1.hasMoreElements()) {
	System.out.print(s1.nextElement()+"-");
}
	System.out.println();
	StringTokenizer s2=new StringTokenizer(str,"a");
	while(s2.hasMoreElements()) {
	System.out.print(s2.nextElement()+"-");
}
	System.out.println();
}
}
