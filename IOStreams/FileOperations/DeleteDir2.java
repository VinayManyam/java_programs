package FileOperations;

import java.io.File;
import java.io.IOException;

public class DeleteDir2 {
	public static void deleteDir(String s) {
	dirDelete(new File(s));
	}
	
	public static void dirDelete(File dir) {
		try {
			if(dir!=null) {
				File dirList[]=dir.listFiles();
				if(dirList!=null) {
					for(int i=0;i<dirList.length;i++) {
						File file=dirList[i];
						if(file.isFile())file.delete();
						else deleteDir(file.toString());
						}
				}dir.delete();
			}else System.out.println("dir is null");
			
		}catch(Exception e) {e.printStackTrace();}
	}
	
	
	
public static void main(String []a) throws IOException {
	DeleteDir2.deleteDir("file3");	
System.out.println("file3 folder deleted");	
}
}
