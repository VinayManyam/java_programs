class B3 extends A3{
	int y=m2();
	int m2(){
		System.out.println("B3 Non static varible");
		return 30;
	}
	{
		System.out.println("B3 Non static Method");
	}
B3(){
	System.out.println("B3 constructor");
}	

public static void main(String[] s){
	System.out.println("B3 main method");
	B3 b=new B3();
	System.out.println("B3 main x:"+b.x+"\n main y:"+b.y);
}
	
}