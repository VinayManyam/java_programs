package InnerClasses;

public class LoInClassA2 {
int x=1;
void m1() {
	System.out.println("------ LoInClassA2 m1() --------");
	final int x=2;
	class LoInClassB2{
		int x=3;
		void m2() {
			System.out.println("======== LoInClassB2 m2() ================");
			System.out.println("LoInClassB2 m2().x:"+x);
			int x=4;
			System.out.println("LoInClassB2 m2() x:"+x);
			System.out.println("LoInClassB2 m2() this x:"+this.x);
			System.out.println("LoInClassB2 m2() LoInClassB2.this.x:"+LoInClassB2.this.x);
			System.out.println("LoInClassB2 m2() LoInClassA2.this.x:"+LoInClassA2.this.x);
		System.out.println("=============================================");
		}
	}
	LoInClassB2 b=new LoInClassB2();
	b.m2();
	System.out.println("m2() x:"+x);
	System.out.println("m2() this x:"+this.x);
	System.out.println("m2() LoInClassA2.this.x:"+LoInClassA2.this.x);
	System.out.println("----------------------------------------------");
}
public static void main(String[] a) {
	System.out.println("LoInClassA2 main()");
	LoInClassA2 b=new LoInClassA2();
	b.m1();
}

}
