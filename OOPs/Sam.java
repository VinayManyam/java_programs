package vin;

public class Sam extends Exe {
Sam(){
//	super();
	System.out.println("it is Sam 0 para");
}
Sam(int y){
	super(40);
	System.out.println("it is Sam 1 para");
}
public static void main(String[] a){
	Sam s=new Sam();
	Sam s1=new Sam(10);
	Exe e=new Exe();
	Exe e1=new Exe(10);
}
}
