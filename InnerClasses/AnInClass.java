package InnerClasses;

public class AnInClass {
	//new AnsInterface() {};
	static AnsInterface a=new AnsInterface() {};
	AnsInterface b=new AnsInterface() {};
	// m1(new AnsInterface() {});
	
	static void m1(AnsInterface a) {
		System.out.println("AnInClass m1()");
	}
	public static void main(String []s) {
		System.out.println("AnInClass main()");
		new AnsInterface() {};
		//new AnsInterface();
		m1(new AnsInterface() {});
		AnsInterface c=new AnsInterface() {};
		m1(c);
	}
	
}
