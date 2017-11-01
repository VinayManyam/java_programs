package IOStreams;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamMain {
public static void main(String[]a ) throws FileNotFoundException {
	System.out.println("PrintStreamMain main()");
	
	PrintStream p=new PrintStream("test4.txt");
	p.print("AB");
	p.println("CDEF");
	p.println(98);
	p.println("GH");
	System.out.println("Data written to test4.txt");
	System.out.print("AB");
	System.out.println(99);
	System.out.println("CDEF");
	System.out.println("GH");
}
}
