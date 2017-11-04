package App;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;

public class College {
@SuppressWarnings("unchecked")
public static void main(String []a) throws IOException {
	LinkedHashMap l=new LinkedHashMap();
	l.put(new Student(1,"vinay",1), new Address(1,2,"hyd"));
	l.put(new Student(2,"vinay2",22), new Address(12,23,"hyd"));
	l.put(new Student(3,"vinay3",333), new Address(123,234,"hyd"));
	System.out.println("l:"+l);
	FileOutputStream f=new FileOutputStream("student.ser");
	ObjectOutputStream o=new ObjectOutputStream(f);
	o.writeObject(l);
	System.out.println("student data is saved...");
}

}
