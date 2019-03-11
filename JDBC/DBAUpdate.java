package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBAUpdate {

	public static void main(String arg[]) throws Exception {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		Scanner sc=null;
		String Sid=null;
		String Name=null;
		int res=0;
				
		try {
			sc=new Scanner(System.in);
			if(sc!=null) {
				System.out.println("Enter id:");
				Sid=sc.next();
				System.out.println("Enter Name:");
				Name=sc.next();
				Name="'"+Name+"'";
			}
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","passowrd");
			st=con.createStatement();
			String query="update student set name="+Name+" where id="+Sid;
			res=st.executeUpdate(query);
			if(res==0) System.out.println("No records Found");
			else System.out.println("updated successfully");

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
		
	} //main close
	
	
}
