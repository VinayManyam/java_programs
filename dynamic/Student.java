package dynamic;

import java.util.Scanner;

public class Student {
	 int sid;
	 String name;
	 long mob;
	 static String countryanme="india";
	 
	public static Student takeInput() {
		Student s=new Student();
		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter ID:");
		int sid=a.nextInt();
		
		System.out.println("Enter name:");
		String name=a.next();
		
		System.out.println("Enter ID:");
		long mob=a.nextLong();
		
		s.setValues(sid, name, mob);
		s.display();
		return s;
	}
	
	void setValues(int sid,String name,long mob) {
		this.sid=sid;
		this.name=name;
		this.mob=mob;
	}
	
	void display() {
		System.out.println("id:"+sid);
		System.out.println("Name:"+name);
		System.out.println("mobile:"+mob);
		System.out.println("Country:"+this.countryanme);
	}
	
	public static void main(String a[]) {
Student s1=takeInput();
Student s2=takeInput();
//s2.display();
	 
 }
}
