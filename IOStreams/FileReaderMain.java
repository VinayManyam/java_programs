package IOStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
public static void main(String []a) throws IOException {
	FileReader f=new FileReader("test4.txt");
	int data;
	while((data=f.read())!=-1) {
		System.out.print((char)data);
	}
}
}
