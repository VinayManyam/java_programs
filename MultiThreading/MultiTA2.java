package MultiThreading;

public class MultiTA2 extends Thread{
public void run() {
	for(int i = 0;i<2;i++) {
		System.out.println(i);
	}
}
	public static void main(String[]a) {
		System.out.println("MultiTA2 main()");
		MultiTA2 m=new MultiTA2();
		MultiTA2 n=new MultiTA2();
		System.out.println("==============  task1 ======================");
		m.run();
		System.out.println("============== Main task2 ==================");
		for(int i = 0;i<2;i++) {
			System.out.println(i);
		}
		System.out.println("================== task3 ===================");
		n.run();
		System.out.println("================== task4 ===================");
		for(int i = 0;i<2;i++) {
			System.out.println(i);
		}
		System.out.println("=============== Done  ======================");
	
	}
	

}
