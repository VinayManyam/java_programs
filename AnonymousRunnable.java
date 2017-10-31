package MultiThreading;

public class AnonymousRunnable {
public static void main(String[] a) {

	new Thread(
			new Runnable() {
				public void run() {
					for(int i=0;i<5;i++) {
						System.out.print(i+" ");
					}
				}
			}
			).start();

	

}
}
