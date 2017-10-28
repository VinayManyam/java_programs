package MultiThreading;

public class MultiTA6 extends Thread{

	void m5() {
		for(int i=5;i>=0;i--) {
			System.out.print(i+":");
			for(int j=i;j>=0;j--) {
				System.out.print(j);
				try {Thread.sleep(500);}catch(InterruptedException e) {
					System.out.println("Error");
				}
			}
			try {Thread.sleep(500);}catch(InterruptedException e) {
				System.out.println("Error");
			}
			System.out.println("\n");
			
		}
	}
	
void m1() {
	for(int i=0;i<=5;i++) {
		System.out.print(i+":");
		for(int j=i;j>=0;j--) {
			System.out.print(j);
			try {Thread.sleep(500);}catch(InterruptedException e) {
				System.out.println("Error");
			}
		}
		try {Thread.sleep(500);}catch(InterruptedException e) {
			System.out.println("Error");
		}
		System.out.println("\n");
		
	}
}
void m2() {
	for(int i=0;i<=5;i++) {
		System.out.print(i+":");
		for(int j=0;j<=i;j++) {
			System.out.print(j);
			try {Thread.sleep(500);}catch(InterruptedException e) {
				System.out.println("Error");
			}
		}
		try {Thread.sleep(500);}catch(InterruptedException e) {
			System.out.println("Error");
		}
		System.out.println("\n");
		
	}
}

void m3() {
	for(int i=0;i<=5;i++) {
		System.out.print("i:"+i+" ");
		try {Thread.sleep(500);}catch(InterruptedException e) {
			System.out.println("Error");
		}
	}
}
void m4() {
	for(int i=5;i>=0;i--) {
		System.out.print("j:"+i+" ");
		try {Thread.sleep(500);}catch(InterruptedException e) {
			System.out.print("Error");
		}
	}
}

	public static void main(String[]a) {
		System.out.println("MultiTA6 main()");
		MultiTA6 m=new MultiTA6();
		m.m1();
		m.m2();
		MultiTA6 n=new MultiTA6();
		n.m1();
		System.out.println("MultiTA6 main() exit");
	}
	
}


