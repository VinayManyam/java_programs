package Collections;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesPro {
public static void main(String []a) throws IOException, IOException {
	Properties p=new Properties();
//	p.load(new FileInputStream(a[0]));
	System.out.println("eid:"+p.setProperty("eid","123"));
	System.out.println("name:"+p.setProperty("ename","vinay"));
	System.out.println("sal"+p.setProperty("sal","10000"));
	System.out.println("desg:"+p.setProperty("desg","eng"));
	System.out.println("company:"+p.setProperty("company","xyz"));
	p.getProperty("exp","Since 2004");
	Enumeration e=p.propertyNames();
	while(e.hasMoreElements()) {
		System.out.println(p.getProperty((String)e.nextElement()));
	}
	p.list(new PrintStream(new FileOutputStream("List.properties")));
	p.store(new PrintStream(new FileOutputStream("sresults.properties")),"Emp Details");
}
}
