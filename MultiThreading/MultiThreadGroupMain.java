package MultiThreading;

public class MultiThreadGroupMain {
public static void main(String[] a) throws InterruptedException {
	System.out.println("MultiThreadGroupMain main()");
	ThreadGroup b=new ThreadGroup("GroupA");
	ThreadGroup c=new ThreadGroup("GroupB");

	MultiThreadGroup d=new MultiThreadGroup(b,"Thread1");
	MultiThreadGroup f=new MultiThreadGroup(b,"Thread2");
	MultiThreadGroup e=new MultiThreadGroup(c,"Thread3");
	MultiThreadGroup g=new MultiThreadGroup(c,"Thread4");
	b.list();
	c.list();
	Thread.sleep(5000);
/*	d.join();
	f.join();
	e.join();
	g.join();*/
	
	System.out.println("MultiThreadGroupMain main() end");
}
	
}
