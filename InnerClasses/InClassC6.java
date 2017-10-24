package InnerClasses;

public class InClassC6{
public static void main(String[] a) {
	System.out.println("InClassC6 main()");
	InClassA6 i=new InClassA6();
	InClassA6.InClassB6 c=new InClassA6.InClassB6();
	
System.out.println("InClassA6 a:"+i.a);
System.out.println("InClassA6 x:"+i.x);
System.out.println("InClassB6 a:"+c.a);
System.out.println("InClassB6 x:"+c.x);
System.out.println("----------- InClassC6->InClassA6.m2() ------------------");
new InClassA6().m2();
System.out.println("----------- InClassC6->InClassA6.InClassB6().m1() ------------------");
new InClassA6.InClassB6().m1();
System.out.println("----------- InClassC6->InClassA6.main() ------------------");
InClassA6.main(a);
System.out.println("------------ InClassC6->InClassA6.InClassB6.main() ---------");
InClassA6.InClassB6.main(a);

}
}