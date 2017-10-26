package InnerClasses;

public class AnInClassA1 {

	static AnsInterface a=new AnsInterface() {};
	AnsInterface b=new AnsInterface() {};
	static void m1() {
		System.out.println("AnInClassA1 m1()");
		AnsInterface c=new AnsInterface() {};
	}
	void m2() {
		System.out.println("AnInClassA1 m2()");
		AnsInterface d=new AnsInterface() {};
	}
	static void m3(AnsInterface e) {
		System.out.println("AnInClassA1 m3()");
	}
	void m4(Runnable a) {
		a.run();
	}
	public static void main(String[] a) {
		System.out.println("AnsInterface main()");
		AnsInterface f=new AnsInterface() {};
		new AnsInterface() {};
		m3(f);
		m3(new AnsInterface() {});
		AnInClassA1 g=new AnInClassA1();
		g.m1();
		g.m2();
		g.m4(new Runnable() {
			public void run() {
				System.out.println("its running");
			}
		});
		}

}
