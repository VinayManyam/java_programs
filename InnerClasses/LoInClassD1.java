package InnerClasses;

public class LoInClassD1 {
public static void main(String []a) {
	System.out.println("LoInClassD1 main()");
	LoInClassA1 b=new LoInClassA1();
	
	b.a=60;
	b.b=70;
	System.out.println("=== b.m1(80, 90) ====");
	b.m1(80, 90);
	System.out.println("=== b.m2() ===");
	b.m2();
}
}
