package InnerClasses;

public class InClassA1 {
static {
	System.out.println("InClassA1");
	
}
public static void main(String[] a) {
	System.out.println("InClassA1 main()");
	InClassB2.main(a);
} 


static class InClassB2{
	static {
		System.out.println("InClassB2");
	}
	public static void main(String[] a) {
		System.out.println("InClassB2 main()");
	} 
}
}
