package arrayobject;

public class ArrB2 {
	static ArrA2[] a1=new ArrA2[5];
	ArrA2[] a2= {new ArrA2(),new ArrA2()};
	public static void main(String[] a) {
		System.out.println("ArrB2 main()");
		ArrA2[] a3=new ArrA2[5];
		System.out.println("a3 array object");
		a1[1]=new ArrA2();
		a3[1]=new ArrA2();
		System.out.println("========== a1[1] ============");
		System.out.println("a1[1].x:"+a1[1].x);
		System.out.println("a1[1].y:"+a1[1].y);
		System.out.println("========== a3[1] ============");
		System.out.println("a3[1].x:"+a3[1].x);
		System.out.println("a3[1].y:"+a3[1].y);
		
		
		System.out.println("========== b.a2[1] ============");
		ArrB2 b=new ArrB2();
		System.out.println("b.a2[1].x:"+b.a2[1].x);
		System.out.println("b.a2[1].y:"+b.a2[1].y);
		System.out.println("b.a1[1].y:"+b.a1[1].y);
		System.out.println("b.a1[1].x:"+b.a1[1].x);
		
		
		
		
		
	}

}
