package App;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollegewebSite {
@SuppressWarnings("rawtypes")
public static void main(String []a) throws IOException, ClassNotFoundException {
	FileInputStream f=new FileInputStream("Student.ser");
	ObjectInputStream o=new ObjectInputStream(f);
	LinkedHashMap l=(LinkedHashMap)o.readObject();
	Set keySet=l.keySet();
	Iterator keyItr=keySet.iterator();
	
	while(keyItr.hasNext()) {
		Object key=keyItr.next();
		Object value=l.get(key);
		System.out.println(key+"\nStudent Address:");
		System.out.println(value);
		System.out.println();
	}
}
}
