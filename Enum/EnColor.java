package Enum;

public enum EnColor {
Red(15),Green(20),Blue(1);
	static int a=10;
	int b=20;
	static void m1() {
		System.out.println("EnColor static m1()");
	}
void m2() {
		System.out.println("EnColor m2()");
	}	
static {
	System.out.println("EnColor static block");
}
{
	System.out.println("EnColor Non-static block");	
}

EnColor(){
	System.out.println("EnColor Constractor");
}
EnColor(int a){
	System.out.println("EnColor COnstractor int para");
}
public static void main(String[] a) {
	System.out.println("EnColor main()");
}
}
