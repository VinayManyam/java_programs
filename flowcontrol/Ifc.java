package flowcontrol;

public class Ifc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=5,y=7;
if(x<y)System.out.println("x is smaler then y");
if(y==7)System.out.println("y=7");
if(m1(x))System.out.println("y=5");
if(true && !false)System.out.println(true);
if(x!=5) System.out.println("line1");System.out.println("line2");//statement terminator
if(x!=5);{System.out.println("block statements");}
	}

	

	private static boolean m1(int a) {
		if(a==5){System.out.println("a=5");
		return true;
		}else { System.out.println("a!=5");
		return false;
		}
	
	}

}
