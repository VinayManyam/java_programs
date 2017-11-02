package FileOperations;

import java.io.File;
import java.io.IOException;

public class FileDirectory {
public static void main(String []a) throws IOException {
	System.out.println("FileDirecotry main()");
	File f=new File("file.txt");
	f.createNewFile();
	
	File f2=new File("file2.txt");
	f2.mkdirs();
	
	File f3=new File("file3");
	f3.mkdirs();
	
	File f4=new File(f3,"file3.txt");
	f4.createNewFile();	
	
	File f5=new File(f3,"file4");
	f5.mkdirs();
	
	File f6=new File("file5","file6");
	f6.mkdirs();
	
	System.out.println("f2: "+f2);
	System.out.println("f3: "+f3);
	System.out.println("f4: "+f4);
	System.out.println("f5: "+f5);
	System.out.println("f6: "+f6);
	
	
	
	
	
	
}
}
