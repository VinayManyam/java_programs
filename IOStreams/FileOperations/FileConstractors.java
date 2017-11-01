package FileOperations;

import java.io.File;

public class FileConstractors {

	public static void main(String []a) {
		System.out.println("main()");
		File f1=new File("f1.txt");
		File f2=new File("Hello","f1.txt");
		File f3=new File("test");
		File f4=new File(f3,"test");
		File f5=new File(f1.toURI());
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		
		}
}
