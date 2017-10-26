package InnerClasses;

public class AnInClassA4 {




	public static void main(String[]s) {
		System.out.println("AnInClassA4 main()");
		AnInterface2 a=new AnInterface2() {
			public void m1() {
				System.out.println("AnInterface2 m1()");
				
			}
			public void m2() {
				System.out.println("AnInterface2 m1()");
				
			}
					
		};
		a.m1();
		//a.m2();

	}

}
