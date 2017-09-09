package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter String:");
		String s=br.readLine();
		System.out.println("Enter Characte:");
		int i=br.read();
		System.out.println(i);
		System.out.println("s:"+s);
	
	}

}
