package IOStreams;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOS implements java.io.Serializable {
public static void main(String []a) throws IOException {
	System.out.println("OOS main()");
	ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("test3.txt"));
	IOB1 i=new IOB1();
	i.x=70;
	i.y=80;
	System.out.println("x:"+i.x+" y:"+i.y);
	o.writeObject(i);
	System.out.println("B Object is written");
}
}
