package javac;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	//System.out.println("Hello");
System.out.println("Enter A Number 0-4:");
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	
		switch(i) {
		case 0:
			System.out.println("Zero");
			break;

		case 1:
			System.out.println("one");
			break;
			
		case 2:
			System.out.println("two");
			break;
			
		case 3:
			System.out.println("three");
			break;
			
		case 4:
			System.out.println("four");
			break;
			
			default:
				System.out.println("Enter Number between 0-4");
		}
	}

}
