package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBAqeary {

public static void main(String srg[]) throws Exception { 
		
		try{  
			 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","password");
		
if (con==null) {
	System.out.println("failed");
}else {
	System.out.println("success");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from student");
	
	
	while(rs.next()!=false) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	st.close();
	rs.close();
}
 			con.close(); 

			  
			}catch(Exception e){ System.out.println(e);}  
			  
	} 
}
