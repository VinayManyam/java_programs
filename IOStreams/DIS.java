package IOStreams;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DIS {
public static void main(String []a) throws IOException {
	System.out.println("DIS");
	FileInputStream f=new FileInputStream("test3.txt");
	DataInputStream d=new DataInputStream(f);
	//String s=d.readUTF();
	int i=d.readInt();

	char o=d.readChar();

	boolean b=d.readBoolean();
	
	
System.out.println((char)i+" "+o+" "+b+" ");

}
}
