package MultiThreading;

public class MultiTB9 extends Thread{
	
	static {
		System.out.println("static block");
		Thread t=Thread.currentThread();
		System.out.println("Static ->"+t.getName()+" thread");
	}
	
	
public static void main(String[] a) {
	System.out.println("MultiTB9 main()");
	Thread t1=Thread.currentThread();
	System.out.println("main() currentThread Name:"+t1.getName()+" thread");
	System.out.println("main() currentThread priority:"+t1.getPriority());
	System.out.println("Static ->"+t1.getName()+" thread");
	System.out.println("-----------------------------------");
	t1.setName("main2");
	t1.setPriority(7);
	System.out.println("t1.name:"+t1.getName());
	System.out.println("t1.priority:"+t1.getPriority());
	
	
	
	
	MultiTA9 m=new MultiTA9();
	MultiTA9 n=new MultiTA9("hello2");
	
	System.out.println("MultiTA9 initial propertes");
	System.out.println("m.name:"+m.getName());
	System.out.println("m.priority:"+m.getPriority());
	System.out.println("----------------------------");
	m.setName("hello");
	m.setPriority(8);
	
	System.out.println("MultiTA9 m object propertes");
	System.out.println("m.name:"+m.getName());
	System.out.println("m.priority:"+m.getPriority());
	System.out.println("----------------------------");
	System.out.println("MultiTA9 n object propertes");
	System.out.println("n.name:"+n.getName());
	System.out.println("n.priority:"+n.getPriority());
	m.start();
	System.out.println("----------m end-----------------");
	n.start();
System.out.println("---------------n end----------------");
for(int j=0;j<5;j++) {
	System.out.println("main->j:"+j);
}
System.out.println("m:"+m);
System.out.println("m:"+n);
System.out.println("t1:"+t1);
Thread o=new Thread();
System.out.println("o:"+o);
	

}

	
}
