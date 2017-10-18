package Polym;

public class PolmX1 {
void m1(PolmA1 a) {
	System.out.println("PolmA1 arg");
}
void m2(PolmB1 b) {
	System.out.println("PolmB1 arg");
}
void m1(Object c) {
	System.out.println("Object para");
}

void m1(Foo f) {
	System.out.println("Foo para");
}


public static void main(String[]a) {
	PolmX1 b=new PolmX1();
	b.m1(new PolmA1());
	b.m2(new PolmB1());
	b.m1(new Foo());
	b.m2(null);
	b.m1((PolmA1)null);
	b.m1((PolmB1)null);
	b.m1(b);
	b.m1(new PolmC4());
	b.m1((PolmC4)null);
	//b.m1(null); =>The method m1(PolmA1) is ambiguous for the type PolmX1
	

}

}
