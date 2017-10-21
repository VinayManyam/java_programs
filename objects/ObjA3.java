package objects;

public class ObjA3 {
int x=10;
int y=11;
void m1(ObjA3 o) {
	o.x=o.x+1;
	o.y=o.y+1;
	m2();
}
void m2() {
	System.out.println("x:"+this.x);
	System.out.println("y:"+this.y);
}
}
