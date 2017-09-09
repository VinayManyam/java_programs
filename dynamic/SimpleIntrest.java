package dynamic;

public class SimpleIntrest {
	public static float si(long p,int t,int r) {
		float si=(p*t*r)/100;
		return si;
	}
public static void main(String a[]) {
	System.out.println(SimpleIntrest.si(2000,4,10));
}
}
