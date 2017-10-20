package Constractors;

public class ConA1 {
ConA1(){
	this(10);
	System.out.println("ConA1 0 para cons.");
}
ConA1(int a){
	//this("hello");
	System.out.println("ConA1 int para cons.");
}
ConA1(String s){
	this();
	
	System.out.println("ConA1 String para cons.");
}

public static void main(String []q) {
	new ConA1("a");
}

	
	
	
}
