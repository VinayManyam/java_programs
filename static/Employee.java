//import java.lang.*;
public class Employee{
	int id;
	String name;
	float Salary;
	boolean isMan;
	char gender;
	static String company="Velsol";
	static String country="IND"; 
	 
	 
	 
	 public void setValues(int id,String name,float Salary,boolean isMan,char gender){
		this.id=id;
this.name=name;		
		this.Salary=Salary;
		this.isMan=isMan;
		this.gender=gender;
	 }
	 public void display(){
		 System.out.print(id+" "+""+name+" "+Salary+" "+isMan+" "+gender);
	 }
	
	public static void main(String[] a){
		System.out.print("hello java \n");
		Employee e1=new Employee();
		e1.setValues(1234,"vinay",10000,true,'m');
		e1.display();
		System.out.print(" company:"+Employee.company);
		System.out.print(" country:"+Employee.country);
		System.out.print("\n");
		Employee e2=new Employee();
		e2.setValues(1234,"vinay",10000,true,'m');
		e2.display();
		System.out.print(" company:"+Employee.company);
		System.out.print(" country:"+Employee.country);
		
		
	}
	
}





