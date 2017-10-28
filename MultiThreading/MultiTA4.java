package MultiThreading;

public class MultiTA4 extends Thread{
	int x;
	MultiTA4(){
		System.out.println("MultiTA4()");
	}
	MultiTA4(int x){
		System.out.println("MultiTA4(int x)");
	}
	
public void run() {
	for(int i = 0;i<2;i++) {
		System.out.println(getName()+i);
	}
}

	public static void main(String[]a) {
		System.out.println("MultiTA4 main()");
		System.out.println("=========== MultiTA4() ==============");
		MultiTA4 m=new MultiTA4();
		m.start();
		System.out.println("=========== MultiTA4(int x) ==============");
		MultiTA4 n=new MultiTA4(10);
		n.start();
		System.out.println("============= main() task =============");
		for(int i = 0;i<2;i++) {
			System.out.println("main:"+i);
		}
		
	
	}
	

}
