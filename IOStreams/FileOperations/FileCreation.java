package FileOperations;

import java.io.File;
import java.io.IOException;

public class FileCreation {
public static void main(String[] a) throws IOException {
	File f=new File("xyz.txt");
	if(!f.exists()) {
		System.out.println("f.createNewFile():"+f.createNewFile());
		System.out.println("file is Created");
	}else {
		if(f.isFile()) {
			System.out.println("in else block");
			System.out.println("File Object is a normal file");
			System.out.println("f.getName():"+f.getName());
			System.out.println("f.lenght():"+f.length());
			System.out.println("f.canRead():"+f.canRead());
			System.out.println("f.getAbsolutePath():"+f.getAbsolutePath());
System.out.println("f.getPath():"+f.getPath());
//System.out.println("f.deleteOnExit()");
//f.deleteOnExit();
System.out.println("f.setReadOnly():"+f.setReadOnly());
System.out.println("f.canWrite():"+f.canWrite());
		}
	}
}
}
