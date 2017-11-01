package IOStreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DOS {
public static void main(String []a) throws IOException {
	System.out.println("DOS");
	FileOutputStream f=new FileOutputStream("test3.txt");
	DataOutputStream d=new DataOutputStream(f);
	d.writeInt(100);
	//d.write(92);
	d.writeBoolean(true);
d.writeUTF("hello");
d.writeChar('h');
System.out.println("Data written to test3");
}
}
