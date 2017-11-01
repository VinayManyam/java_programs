package IOstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStreamPro {
public static void main(String []a) throws IOException {
	System.out.println("IOStreamPro main()");
	BufferedReader b=new BufferedReader(new FileReader("test4.txt"));
	StringBuilder str=new StringBuilder();
	
	int data;
	while((data=b.read())!=-1) {
		str.append((char)b.read());
	}
	String s=str.toString();
	System.out.println(s);
	s=s.replaceAll("H", "Z");
	System.out.println(s);
	FileWriter f=new FileWriter("test5.txt");
	f.write(s);
	System.out.println("done");
	f.close();
	b.close();
	
}
}
