package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BasicTry {
	public static void main(String arg[]) throws Exception {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		Scanner sc=null;
		String Sid=null;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","password");){
			if(con1!=null) {
				try(Statement st1=con1.createStatement()){
					if(st1!=null) {
						try(ResultSet rs1=st1.executeQuery("select * from student where id=123")){
							while(rs1.next()) {
								flag =true;
								System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3));
							}if(flag==false) {
								System.out.println("No records Founs");
							}	
						}
					}
				}
			}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		
				

	}	
}
