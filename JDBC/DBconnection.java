package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
public static void main(String srg[]) throws Exception { 
		
		try{  
			 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Vinayh7541");
		
if (con==null) {
	System.out.println("failed");
}else {
	System.out.println("success");
}
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
	}


}
