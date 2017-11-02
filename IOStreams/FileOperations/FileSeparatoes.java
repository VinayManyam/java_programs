package FileOperations;

import java.io.File;

public class FileSeparatoes {

	public static void main(String []a) {
		File f=new File("C:\\Users\\java\\eclipse-workspace\\Examples\\xyz.txt");
	System.out.println("f exists:"+f.exists());
	String s=File.separator;
	System.out.println("file separator:"+s);
	File f1=new File("C:"+s+"Users"+s+"java"+s+"eclipse-workspace"+s+"Examples"+s+"xyz.txt");
	System.out.println("f1 exists:"+f1.exists());
	}
}
