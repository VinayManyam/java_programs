class A3{
int x=m1();
int m1(){
	System.out.println("A3 non static variable");
	return 20;
}
{
	System.out.println("A3 Non static method");
}
A3(){
	System.out.println("A3 constructor");
}

public static void main(String[] s){
	System.out.println("hello");
	//A3 a=new A3();
	//A3 a=new A3();
}
}