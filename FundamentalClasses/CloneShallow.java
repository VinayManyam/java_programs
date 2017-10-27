package FundamentalClasses;

public class CloneShallow implements Cloneable{
int sno=1;
String sname="s1";
String scourse="java";
double fee=4321;
CloneAdress c=new CloneAdress();

public static void main(String []a) throws CloneNotSupportedException{
	CloneShallow e=new CloneShallow();
	CloneShallow f=(CloneShallow)e.clone();
	System.out.println("e.c==f.c:"+(e.c==f.c));
	
}
}
