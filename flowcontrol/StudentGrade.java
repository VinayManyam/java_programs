package flowcontrol;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number:");
		int i=s.nextInt();
		System.out.print("Grade:");
		if(i>=90&&i<=100)System.out.print("O");
		else if(i>=80&&i<=90)System.out.print("A");
		else if(i>=70&&i<=80)System.out.print("B");
		else if(i>=60&&i<=70)System.out.print("C");
		else if(i>=50&&i<=60)System.out.print("D");
		else if(i>=0&&i<=50)System.out.print("F");
		else System.out.print("Please enter marks 0-100");
		

	}

}
