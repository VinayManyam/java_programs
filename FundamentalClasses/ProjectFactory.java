package FundamentalClasses;

public class ProjectFactory implements Cloneable{
	public static void main(String[] a) throws CloneNotSupportedException{
		System.out.println("ProjectFactory main()");
		Bike b=new Bike(123,2012,"tvs");
		Bike b2=(Bike)b.clone();
		Bike b3=(Bike)b2.clone();
		System.out.println("b2==b:"+(b2==b));
		b.setBikeNumber(541);
		b2.setBikeNumber(542);
		b3.setBikeNumber(543);
		System.out.println("b Details: \n"+b);
		System.out.println("==================");
		System.out.println("b2 Details: \n"+b2);
		System.out.println("==================");
		System.out.println("b3 Details: \n"+b3);	
		
		
		
		
	}

}
