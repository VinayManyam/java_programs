package InnerClasses;

public class AnInClassA2 {
	void m1(Thread e) {
		e.run();
	}
public static void main(String[]a) {
	Thread t1=new Thread(){	public void run() {	System.out.println("Thread T1 is running");}};
	Thread t2=new Thread() {};
	
	AnInClassA2 e=new AnInClassA2();
	e.m1(t1);
	e.m1(t2);
	e.m1(new Thread() {});
	e.m1(new Thread());
	e.m1(new Thread() {	public void run() {	System.out.println("AnInClassA2 e.m1 Thread is running");}});
		
}
}
