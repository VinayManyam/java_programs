package MultiThreading;

public class MultiTA5 extends Thread{
	
public void run() {
	for(int i = 0;i<5;i++) {
		System.out.println(getName()+i);
	}
}

	public static void main(String[]a) {
		System.out.println("MultiTA5 main()");
		System.out.println("====== Thread1 start =====");
Thread1 t=new Thread1();
t.start();
System.out.println("====== Thread2 start =====");
Thread2 t1=new Thread2();
t1.start();
System.out.println("MultiTA5 main() exit");
	
	}
	
}
