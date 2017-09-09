package flowcontrol;

public class Ifelse {

	public static void main(String[] args) {
		int x=5,y=7;
		if(x<y)System.out.println("x is smaler then y");else System.out.println("x is bigger then y");
		if(y!=7)System.out.println("y=7");else System.out.println("y!=7");
		if(m1(x))System.out.println("y=5");else System.out.println("y!=5");
		if(true && false)System.out.println(true);else System.out.println(false);
		if(x!=5) System.out.println("line1");else System.out.println("line2");//statement terminator


	}

	private static boolean m1(int a) {
		if(a==5){System.out.println("a=5");
		return true;
		}else { System.out.println("a!=5");
		return false;
		}
	}

}
