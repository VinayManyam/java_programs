package FundamentalClasses;

public class CloneA2 implements Cloneable {

public static void main(String []a)throws CloneNotSupportedException {
	System.out.println("CloneA1 main");

		CloneA2 e=new CloneA2();
		CloneA2 e2=(CloneA2)e.clone();
		G1.m1(e);
		G1.m1(e2);
		System.out.println("CloneA2 e :"+e);
		System.out.println("CloneA2 e2:"+e2);
	
}

}
