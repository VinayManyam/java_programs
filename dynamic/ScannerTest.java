package dynamic;

import java.util.Scanner;

public class ScannerTest{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number:");
		int i=s.nextInt();
		System.out.println(i);

		System.out.print("Enter Float:");
		float j=s.nextFloat();
		System.out.println(j);

		System.out.print("Enter word:");
		String k=s.next();
		System.out.println(k);	
		
		
		System.out.print("Enter Sentance:");
		s.nextLine();
		String l=s.nextLine();
		System.out.println(l);	
		
		System.out.print("Enter Boolean:");
		boolean m=s.nextBoolean();
		System.out.println(m);	


	}

}
