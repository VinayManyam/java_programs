package IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {
public static void main(String[]a) throws IOException {
	System.out.println("FIS");
	FileInputStream f=new FileInputStream("test.txt");
	
	int i=f.read();
	System.out.println((char)i);
	
}
}
