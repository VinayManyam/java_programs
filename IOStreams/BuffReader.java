package IOStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dynamic.BufferReader;

public class BuffReader {

	public static void main(String []a) throws IOException {
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter data:");
		String line=b.readLine();
	System.out.println("line:"+line);
	System.out.println("enter a:");
	int d=Integer.parseInt(b.readLine());
	System.out.println("enter b:");
	int c=b.read();
	System.out.println("a+b:"+(d+c));
		
	}
}
