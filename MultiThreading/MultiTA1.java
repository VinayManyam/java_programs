package MultiThreading;

public class MultiTA1 extends Thread{
public void run() {
	for(int i = 0;i<2;i++) {
		System.out.println(getName()+i);
	}
}
	public static void main(String[]a) {
		System.out.println("MultiTA1 main()");
		MultiTA1 m=new MultiTA1();
		MultiTA1 n=new MultiTA1();
		System.out.println("==============  task1 ======================");
		m.start();
		System.out.println("============== Main task2 ==================");
		for(int i = 0;i<2;i++) {
			System.out.println(i);
		}
		System.out.println("================== task3 ===================");
		n.start();
		System.out.println("================== task4 ===================");
		for(int i = 0;i<2;i++) {
			System.out.println(i);
		}
		System.out.println("=============== Done  ======================");
	
	}
	

}
