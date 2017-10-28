package MultiThreading;

public class MultiTA7 extends Thread{
static MultiTA6 n=new MultiTA6();
public void run() {
	n.m4();
	}
public void start() {
	n.m1();
	super.start();
}
	public static void main(String[]a) {
		System.out.println("MultiTA7 main()");
		MultiTA6 m=new MultiTA6();
		
		MultiTA7 o=new MultiTA7();
		MultiTA7 o1=new MultiTA7();
		MultiTA7 o2=new MultiTA7();
		long t=System.currentTimeMillis();
		o.start();
		m.m3();
		System.out.println("\ntesting.........");
		o1.run();
		o2.start();
		
		m.m5();

		long t1=System.currentTimeMillis();
		System.out.println("\n time:"+((t1-t)/1000)+" sec");
		System.out.println("MultiTA7 main() exit");
	}
	
}
