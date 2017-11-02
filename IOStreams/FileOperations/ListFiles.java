package FileOperations;

import java.io.File;

public class ListFiles {
	public static void listFiles(String file) {
		listFiles(new File(file));
	}
	public static void listFiles(File f) {
		try {
			File dirList[]=f.listFiles();
			if(dirList!=null) {
				for(int i=0;i<dirList.length;i++) {
					File file=dirList[i];
					if(file.isFile()) {
						System.out.println(file+" is a file");
					}else {
						System.out.println(file+" is a directory");
					}
				}
			}else {
				System.out.println("directory is null");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
public static void main(String []a) {
	System.out.println("main()");
	ListFiles.listFiles("bin");
}
}
