package MultiThreading;

public class AnonymousThread {
public static void main(String[] a) {
	
	(new Thread(){
		public void run() {
			for(int i=0;i<5;i++) {System.out.print(i+" ");}
		}}).start();


}
}
