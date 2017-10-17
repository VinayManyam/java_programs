package Interface;

public class IntrF1 extends IntrE1 {
public void m2() {
	System.out.println("m2() in IntrF1 class");
}
IntrF1(){
	System.out.println("IntrF1 Constructor");
}
public static void main(String []a) {
	System.out.println("IntrF1 main()");

IntrA1 b=new IntrF1();
b.m1();
b.m2();
}
}
