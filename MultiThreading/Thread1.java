package MultiThreading;

public class Thread1 extends Thread {
	public void run() {
		for(int i = 0;i<2;i++) {
			System.out.println("Thread1->"+getName()+i);
		}
		}
	public void start() {
		System.out.println("starting...");
		super.start();
	}
	
	
}
