package Enum;

public class Year {
public static void main(String[]a ) {
	System.out.println(Month.Jan);
	System.out.println(Month.Feb);
	System.out.println("==========================");
	Month[] m=Month.values();
	for(Month n:m) {
		System.out.print(n.ordinal()+1+".");
		System.out.println(n.name());
	}
}
}
