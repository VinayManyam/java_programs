package Polym;

public class PolmX3 {
	PolmX3(){
		System.out.println("PolmX3 no para");
	}
	PolmX3(int i){
		System.out.println("PolmX3 int para");
	}
	PolmX3(String s){
		System.out.println("PolmX3 String para");
	}
	public static void main(String []a) {
		PolmX3 b=new PolmX3();
		PolmX3 c=new PolmX3(3);
		PolmX3 d=new PolmX3("hello");
	}
}
