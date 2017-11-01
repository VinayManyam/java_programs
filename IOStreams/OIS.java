package IOStreams;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class OIS implements java.io.Serializable {
public static void main(String []a) throws IOException, ClassNotFoundException {
	System.out.println("OIS main()");
	ObjectInputStream o=new ObjectInputStream(new FileInputStream("test3.txt"));
Object x=o.readObject();
	System.out.println("Test3.text:"+x);
}
}
