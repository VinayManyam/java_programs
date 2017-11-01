package IOStreams;

import java.io.IOException;

public class SysInRead {
public static void main(String []a) throws IOException {
	System.out.println("Enter data:");
	int data=System.in.read();
	System.out.println("data:"+(char)data);
	System.out.println("data:");
/*	while((data=System.in.read())!=-1) {
		System.out.print((char)data);
	}*/
	while((data=System.in.read())!=97) {
		System.out.print((char)data);
	}
}
}
