package typecast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TypeCast {

	public static void main(String[] args) throws IOException {
		String s="1234";
int i=Integer.parseInt(s);
System.out.println("s:"+s);
String s1="5678";
System.out.println("s1:"+s1);
int j=Integer.parseInt(s1);
System.out.println("i:"+i);
System.out.println("j:"+j);
System.out.println("s+s1:"+s+s1);
i+=j;
System.out.println("i+j:"+i);

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter float:");
	int d=br.read();
System.out.println();
	
	}

}
