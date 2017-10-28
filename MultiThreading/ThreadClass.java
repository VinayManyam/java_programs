package MultiThreading;

public class ThreadClass extends Thread {
public void run() {
	System.out.println("it is running....");
	}
public static void main(String[]a) {
	System.out.println("ThreadClass main()");
	ThreadClass m=new ThreadClass();
	m.start();
}
}
