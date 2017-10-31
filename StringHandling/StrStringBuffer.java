package StringHandling;

public class StrStringBuffer {
public static void main(String []a) {
	StringBuffer b=new StringBuffer("StrBuffer");
	StringBuffer c=new StringBuffer(b);
	System.out.println("b:"+b);
	System.out.println("c:"+c);
	System.out.println("b==c:"+(b==c));
	System.out.println("b.equals(c):"+b.equals(c));
	System.out.println("b.capacity:"+b.capacity());
	System.out.println("c.capacity:"+c.capacity());
	StringBuffer d=new StringBuffer("abc");
	System.out.println("d:"+d);
	StringBuffer e=d.append("d");
	System.out.println("d:"+d);
	System.out.println("e:"+e);
	System.out.println("d==e:"+(d==e));
	StringBuffer f=b.insert(3,"/");
	System.out.println("f:"+f);
	StringBuffer g=new StringBuffer("vinay kumar manyam");
	System.out.println("g:"+g);
	g.delete(g.indexOf("kumar"),g.indexOf("kumar")+6 );
	System.out.println("Deleted g:"+g);
	b.deleteCharAt(b.indexOf("/"));
	System.out.println("b:"+b);
	System.out.println("b.reverse():"+b.reverse());
	System.out.println("b.capacity():"+b.capacity());
	System.out.println("b.lenght():"+b.length());

	//ensurecapacity
	b.ensureCapacity(51);
	System.out.println("b.capacity():"+b.capacity());
	b.trimToSize();
	System.out.println("b.capacity():"+b.capacity());
b.setLength(10);
System.out.println("b.capacity():"+b.capacity());
System.out.println("b.lenght():"+b.length());
b.setLength(5);
System.out.println("b:"+b);
System.out.println("b.capacity():"+b.capacity());
System.out.println("b.lenght():"+b.length());

}
}
