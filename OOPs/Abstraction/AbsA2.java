package abs;

abstract class AbsA2 {

	abstract void m1();
	
	static int a=20;
	int y=40;
	
	static {
		System.out.println("static block in AbsA2 class");
	}
	
	{
		System.out.println("block in AbsA2 class");
	}
	AbsA2(){
		System.out.println("AbsA2 constructor method");
	}
	
	static void m2() {
		System.out.println("static m2() in AbsA2 class");
	}
	
	void m3() {
		System.out.println("method m3() in AbsA2 class");
	}
	
	public static void main(String []a) {
		System.out.println("AbsA2 main method");
		System.out.println("a:"+AbsA2.a);
		//AbsA2 b=new AbsA2();
		AbsA2.m2();
	}
	
	
	
}
