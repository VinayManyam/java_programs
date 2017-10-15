package vin;

public class Y2 extends X2 {
int x=30;
int y=40;
void m2(){
	super.m1();
	int x=50;
	int y=60;
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	
	System.out.println("x:"+super.x);
	System.out.println("y:"+super.y);
}

void m3(){
	int x=70;
	int y=80;
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	
	System.out.println("x:"+this.x);
	System.out.println("y:"+this.y);
	
	System.out.println("x:"+super.x);
	System.out.println("y:"+super.y);
}
		
public static void main(String[] args) {
Y2 y=new Y2();
y.m2();
y.m3();
	}

}
