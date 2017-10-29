package MultiThreading;

public class MultiTA8 extends Thread{

	public static void main(String[]a) {
		System.out.println("MultiTA8 main()");
		Thread3 t=new Thread3();
		t.start();
		Thread3 t3=new Thread3();
		t3.start();
		Thread4 t1=new Thread4();
		t1.start();
		Thread4 t2=new Thread4();
		t2.start();
	Thread5 t4=new Thread5();
		t4.start();
		Thread6 t5=new Thread6();
		t5.start();
		
		System.out.println("MultiTA8 main() exit");
	}
	
}
