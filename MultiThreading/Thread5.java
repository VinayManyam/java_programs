package MultiThreading;

public class Thread5 extends Thread {
	public void run() {
		for(int i = 10;i>0;i--) {
			System.out.print(i+" ");
			try {Thread.sleep(800);}catch(InterruptedException e) {
				System.out.println("Error");
			}	
		}
		}
	public void start() {
		System.out.println("Thread5 is starting...");
		super.start();
	}
	
	
}
