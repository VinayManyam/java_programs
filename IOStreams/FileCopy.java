package IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
public static void main(String []a) throws IOException {
	System.out.println("File Copy");
	FileInputStream f=new FileInputStream("test.txt");
	FileOutputStream f1=new FileOutputStream("test2.txt",true);
	int i;

	while((i=f.read())!=-1) {
		
f1.write(i);

	}
	System.out.println("file copyed now!");

}
}
