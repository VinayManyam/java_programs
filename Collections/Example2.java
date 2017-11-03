package Collections;

public class Example2 implements Comparable{
int x=10;
int y=20;
int z;

Example2(int z){
	this.z=z;
}
public int compareTo(Object arg0) {
	Example2 e=(Example2)arg0;
	return e.z-this.x;
}
public String toString() {
	return ""+z;
}
}
