package Interface;

public class IntrB1 implements IntrA1 {
public void m1() {
	System.out.println("m1() implemented from IntrB1 to intrA1");
}
public void m2() {
	System.out.println("m2() implemented from IntrB1 to intrA1");
}
IntrB1(){
	System.out.println("IntrB1 constructor");
}

public static void main(String[] a) {
	System.out.println("This is IntrB1 class main()");
    IntrB1 b=new IntrB1();
    b.m1();
    b.m2();
}
}
