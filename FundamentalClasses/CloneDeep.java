package FundamentalClasses;

public class CloneDeep  implements Cloneable{
int sno=1;
String sname="s1";
String scourse="java";
double fee=4321;
CloneAdress2 c=new CloneAdress2();

public CloneDeep clone() throws CloneNotSupportedException {
	CloneDeep h=new CloneDeep();
System.out.println("h:"+h);
	CloneDeep g=(CloneDeep)super.clone();
	g.c=this.c.clone();
	System.out.println("g:"+g);
	return g;
}

public static void main(String []a) throws CloneNotSupportedException{
	System.out.println("CloneDeep main():");
	CloneDeep e=new CloneDeep();
	CloneDeep f=(CloneDeep)e.clone();
	System.out.println("f:"+f);
	System.out.println("e.c:"+e.c);
	System.out.println("f.c:"+f.c);
	System.out.println("e.c==f.c:"+(e.c==f.c));
	
	
}
}
