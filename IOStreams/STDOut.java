package IOStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class STDOut {
public static void main(String[] a) throws IOException {
	System.out.println("STDOut main()");
	System.out.println("data before setOut()");
	System.err.println("data before setErr()");
	PrintStream p=new PrintStream("setout.txt");
	PrintStream p1=new PrintStream("setErr.txt");
	System.setOut(p);
	System.setErr(p1);
	System.out.println("data after setOut()");
	System.err.println("data after setErr()");
	int x=10/0;
}
}
