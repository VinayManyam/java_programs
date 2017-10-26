package InnerClasses;

public class AnInClassA3 {

	static int a=10;
	public int b=20;

	void m1() {
		int c=30;
		final int d=40;
		Thread t=new Thread() {
			public void run() {
				System.out.println("Thread a:"+a);
				System.out.println("Thread a:"+b);
				System.out.println("Thread a:"+c);
				System.out.println("Thread a:"+d);
			}
	
			
		};
		m4(t);
		
	
	}

	void m4(Thread e) {
		e.run();
	}

	public static void main(String[]s) {
		System.out.println("AnInClassA3 main()");
		AnInClassA3 e=new AnInClassA3();
		e.m1();
		e.m4(new Thread() {	public void run() {	
			System.out.println("AnInClassA3 b.m4 Thread is running");
			System.out.println("Thread a:"+a);
		//	System.out.println("Thread a:"+b);
			}});
		

	}

}
