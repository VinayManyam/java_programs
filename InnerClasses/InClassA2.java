package InnerClasses;


public class InClassA2 {
	InClassA2 (){
		System.out.println("InClassA1 constractor");
	}
static int u=10;
int x=20;
private int y=30;

public static void main(String[] a) {
	System.out.println("InClassA1 main()");
	System.out.println("========== InClassB1 instance =========");
	InClassB1 b=new InClassB1();

	

}

static class InClassB1 {
	 InClassB1() {
		 System.out.println("InClassB1 constractor");
		 
	}
	public static void main(String[] a) {
		InClassA2.main(a);
		
		System.out.println("InClassB2 main()");
		InClassA2 b=new InClassA2();
		System.out.println("========== InClassA1 instance =========");
		System.out.println("InClassA1.b.x:"+b.x);
		System.out.println("InClassA1.b.y:"+b.y);
		System.out.println("InClassA1.b.u:"+u);

		
		
		
	}
}
}
