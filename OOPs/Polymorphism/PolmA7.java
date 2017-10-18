package Polym;

public class PolmA7 {
void add() {
	System.out.println("PolmA7 No para");
}
void add(int i) {
	System.out.println("PolmA7 1 para int");
}
void add(String s) {
	System.out.println("PolmA7 1 para String");
}
void add(float a) {
	System.out.println("PolmA7 1 para float");
}

int test() {
	return 0;
}

public static void main(String[] a) {
	System.out.println("PolmA7 main()");
	PolmA7 b=new PolmA7();
	int c=123;
	b.add();
	b.add(1);
	b.add("a");
	b.add((float)c);
	b.add(b.test());
}
}
