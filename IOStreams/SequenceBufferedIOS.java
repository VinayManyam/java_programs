package IOStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceBufferedIOS {
public static void main(String []a) throws IOException {
	System.out.println("SequenceBufferedIOS main()");
	
	FileInputStream f=new FileInputStream("test3.txt");
	FileInputStream f1=new FileInputStream("test.txt");
	SequenceInputStream s=new SequenceInputStream(f,f1);
	int data;
	while((data=s.read())!=-1) {
		System.out.print((char)data);
	}
	
	
}
}
