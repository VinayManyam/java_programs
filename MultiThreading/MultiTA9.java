package MultiThreading;

public class MultiTA9 extends Thread{
	MultiTA9(){
		super();
	}
	MultiTA9(String s){
		super(s);
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName()+"->i:"+i);
		}
	}

	
}
