package arrays;

import java.util.Scanner;

public class BasicA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter A Number 0-4:");
		@SuppressWarnings("resource")
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



	String[] arr; 
	arr=new String[7];
	arr[0]="MON";
	arr[1]="TUE";
	arr[2]="WED";
	arr[3]="THU";
	arr[4]="Fri";
	arr[5]="SAT";
	arr[6]="SUN";
	
	for(int i1=0;i1<7;i1++) {
		System.out.println(arr[i1]);
	}
	

	}

}
