package FileOperations;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter implements FilenameFilter {
String eFile;
public FileFilter(String eFile) {
	this.eFile=eFile;
	}
public boolean accept(File dir,String name) {
	return name.endsWith(eFile);
}
public static void main(String []a) {
	String dir="bin";
	File f=new File(dir);
	FilenameFilter f1= new FileFilter("txt");
	
	String sfile[]=f.list(f1);
	for(int i=0;i<sfile.length;i++) {
		System.out.println(sfile[i]);
	}
	
	
			}


}
