package Polym;

public class PolmB8 extends PolmA8 {

	public static void main(String[] a) {
		PolmB8 b=new PolmB8();
		Object o1=new Object();
		Object o2="Hello";
		Object o3=new Integer(123);
		b.foo(o1);
		b.foo(o2);
		b.foo(o3);
		System.out.println("=====================");
		b.foo("Hello");
		b.foo(123);
		
		System.out.println("=====================");
		b.foo(((String)o2));
		b.foo(((Integer)o3));
		
		System.out.println("=====================");
		//b.foo(((String)o1));
		//b.foo(((Integer)o1));
		//b.foo(((String)o3));
		//b.foo(((Integer)o2));
		
		
	}
	
}
