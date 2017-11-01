package IOstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankTransaction {

	public static void main(String []a) throws IOException {
		Bank b=new Bank();
		b.setAccHName("vinay manyam");
		b.setAccNo(541);
		b.setBalance(10000);
		b.setPassword("vinay");
		b.setUserName("vinay123");
		System.out.println(b.toString());
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("bank.ser"));
		o.writeObject(b);
		System.out.println("object writen to file");
		
	}
}
