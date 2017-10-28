package MultiThreading;

public class MultiTA3 extends Thread{
public void run() {
	for(int i = 0;i<8;i++) {
		System.out.println(i);
	}
}
	public static void main(String[]a) {
		System.out.println("MultiTA3 main()");
		MultiTA3 m=new MultiTA3();
		System.out.println("==============  task1 start() ======================");
		m.start();
		System.out.println("============== Main task2 ==================");
		for(int i = 0;i<8;i++) {
			System.out.println("main :"+i);
		}
	
	}
	

}
