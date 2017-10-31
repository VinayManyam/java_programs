package MultiThreading;

public class MultiThreadGroup extends Thread {
String name;
MultiThreadGroup(ThreadGroup tg,String name){
	this.name=name;
	new Thread(tg,this).start();
}

public void run() {
	System.out.println("Thread is running....");
	try {
		for(int i=0;i<5;i++) {
		System.out.print(i+" ");
		System.out.println();
		Thread.sleep(500);
		}
	}catch(InterruptedException e) {
		System.out.println("Thread is interrupted...");
	}
	System.out.println("exiting...");
}
}
