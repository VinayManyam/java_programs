//import java.lang.*;
public class Employee{
	int id;
	String name;
	float Salary;
	boolean isMan;
	char gender;
	String company;
	String country; 
	 
	 
	 
	 public void setValues(int id,String name,float Salary,boolean isMan,char gender,String company,String country){
		this.id=id;
this.name=name;		
		this.Salary=Salary;
		this.isMan=isMan;
		this.gender=gender;
		this.company=company;
		this.country=country;
		 
	 }
	 public void display(){
		 System.out.print(id+" "+""+name+" "+Salary+" "+isMan+" "+gender+" "+company+" "+country);
	 }
	
	public static void main(String[] a){
		System.out.print("hello java \n");
		Employee e1=new Employee();
		e1.setValues(1234,"vinay",10000,true,'m',"velsol","india");
		e1.display();
		
	}
	
}





