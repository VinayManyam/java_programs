package Constractors;

public class ConB1 extends ConA1 {

	ConB1(){
		this(10);
		
		System.out.println("ConB1 0 para cons.");
	}
	ConB1(int a){
		this("hello");
		System.out.println("ConB1 int para cons.");
	}
	ConB1(String s){
	super("a");
	System.out.println("ConB1 String para cons.");
	}
	public static void main(String []a) {
		System.out.println("========= ConB1 Instance ===========");
		ConB1 b=new ConB1();
		System.out.println("---------------");
		new ConB1(10);
		System.out.println("---------------");
		new ConB1("a");
		
		System.out.println("========= ConA1 Instance ===========");
		ConA1 c=new ConA1();
		System.out.println("---------------");
		new ConA1(10);
		System.out.println("---------------");
		new ConA1("a");
		
	}

}
