package IOStreams;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FOS {
public static void main(String []a) throws IOException {
	System.out.println("FOS");
	FileOutputStream f=new FileOutputStream("test.txt",true); 
	Scanner s=new Scanner(System.in);
	System.out.println("Enter text to test.txt");
	f.write(97);
	f.write('b');
	System.out.println("char 97 entered");
}
}
