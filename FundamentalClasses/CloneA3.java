package FundamentalClasses;

public class CloneA3 implements Cloneable {
Test t=new Test();
public static void main(String []a)throws CloneNotSupportedException {
	System.out.println("CloneA3 main()");
	CloneClass c=new CloneClass();
	CloneClass d=c.clone();
	System.out.println(c);
	System.out.println(d);
	
	CloneA3 x=new CloneA3();
	CloneA3 y=(CloneA3)x.clone();
	CloneA3 z=new CloneA3();
	
	System.out.println("CloneA3 x.t==CloneA3 y.t:"+(x.t==y.t));
	System.out.println("CloneA3 x.t==CloneA3 z.t:"+(x.t==z.t));

}

}
