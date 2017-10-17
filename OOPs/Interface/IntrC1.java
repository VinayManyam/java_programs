package Interface;

public class IntrC1 extends IntrB1{
	public void m1() {
		super.m1();
		System.out.println("m1() implemented from IntrC1 to intrA1");
	}
	public void m2() {
		super.m2();
		System.out.println("m2() implemented from IntrC1 to intrA1");
	}

	IntrC1(){
		System.out.println("IntrC1 Constructor");
	}
	public static void main(String[] a) {
		System.out.println("This is IntrB1 class main()");
	    IntrA1 b=new IntrC1();
	    b.m1();
	    b.m2();
	    
	  
	    
	}
}
