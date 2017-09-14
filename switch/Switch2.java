package javac;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		//System.out.println("Hello");
	System.out.println("Enter letter:");
		Scanner s=new Scanner(System.in);
		String i=s.next();
		
			switch(i) {
			case "a":
				System.out.println("A");
				break;

			case "i":
				System.out.println("I");
				break;
				
			case "e":
				System.out.println("E");
				break;
				
			case "o":
				System.out.println("O");
				break;
				
			case "u":
				System.out.println("U");
				break;
				
				default:
					System.out.println("Not consonent");
			}
	}

}
