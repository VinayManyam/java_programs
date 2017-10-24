package varArgPara;

public class varArgsRules {
	static void m1(int...a) {
		System.out.println("para lenght:"+a.length);
	}
	void m2(int ...ia) {}
	void m3(int... a) {}
	void m4(int[]... a) {}
	void m5(int[][]... a) {}
	void m6(int[]a[]) {}
	void m7(int a,int... b) {}
	
	public static void main(String[] s) {
		m1();
	
	}

}
