package MultiThreading;

public class RunnableInterface implements Runnable {
	public void run() {
		System.out.println("it is running.....");
	}
	public static void main(String[] a) {
		System.out.println("RunnableInterface main()");
		RunnableInterface r=new RunnableInterface();
	Thread t=new Thread(r);
	t.start();
	
	}
	

}
