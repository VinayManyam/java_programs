package FileOperations;

import java.io.File;
import java.io.IOException;

public class DeleteDir {
public static void main(String []a) throws IOException {
	System.out.println("Delete dir main():");
	
	File f=new File("filedel.txt");
	f.createNewFile();
System.out.println("file exists:"+f.exists());
	//f.delete();
	System.out.println("deleting.. "+f);
	if(!f.exists()) {
		System.out.println(f+" is deleted");
	}else {
		System.out.println(f+" is not deleted");
	}
	File f1=new File("filede2.txt");
	f1.createNewFile();
	System.out.println(f1+" file Status:"+f1.exists());
		System.out.println("deleting.. "+f1);
	
		f1.deleteOnExit();
		System.out.println(f1+" file Status:"+f1.exists());
		if(!f1.exists()) {
		System.out.println(f1+" is deleted");
	}else {
		System.out.println(f1+" is not deleted");
	}
		File f2=new File("test");
		System.out.println(f2+" dir is exists:"+f2.exists());
		f2.delete();
		System.out.println(f2+" dir is exists:"+f2.exists());
}
}
