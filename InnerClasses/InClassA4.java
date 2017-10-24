package InnerClasses;

public class InClassA4 {
static {
System.out.println("InClassA4 static block");
}
static class InClassB4{
	static {
		System.out.println("InClassB4 static block");	
	}
	public static void main(String[] a) {
		System.out.println("InClassB4 main()");
	}
	
}

public static void main(String[] a) {
	System.out.println("InClassA4 main()");
}

}
