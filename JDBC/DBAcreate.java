package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBAcreate {

	public static void main(String arg[]) throws Exception {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		Scanner sc=null;
		String query=null;
		int i=0;
					
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","password");
			st=con.createStatement();
query="create table student8 (id int,name char(10),city char(10))";
i=st.executeUpdate(query);
System.out.println("i:"+i);
if (i==0)System.out.println("table created successfully");
else System.out.println("table not created");

			
		}//close try
		catch (SQLException se){		se.printStackTrace();	}
		catch (ClassNotFoundException e) {	e.printStackTrace();		}
		catch (Exception e) {		e.printStackTrace();		}
		finally {
			try {	if(rs!=null) rs.close();}
			catch(SQLException e) {e.printStackTrace();}
			try {	if(st!=null) st.close();}
			catch(SQLException e) {e.printStackTrace();}
			try {	if(con!=null) con.close();}
			catch(SQLException e) {e.printStackTrace();}
			try {	if(sc!=null) sc.close();}
			catch(Exception e) {e.printStackTrace();}
			
					}//close final;
		
		
		}

}
