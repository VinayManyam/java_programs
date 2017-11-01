package IOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BankUser {
public static void main(String []a) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream ols=new ObjectInputStream(new FileInputStream("bank.ser"));
	
	Bank accDetails=(Bank)ols.readObject();
	System.out.println(accDetails.getAccHName()+ " details");
System.out.println(accDetails);
}
}
