package InnerClasses;

public class InClassA3 {

	static class InClassB3 {
		private int y=10;
		static void m1() {System.out.println("InClassB3 static m1()");}
		void m2() {
			System.out.println("InClassB3 m2()");
		}
		
		}
	public static void main(String[] s) {
		System.out.println("InClassA3 main()");
		InClassB3.m1();
		InClassB3 b=new InClassB3();
		b.m2();
		System.out.println("InClassA3.y:"+b.y);
		
	}
	
}
