package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBAexecute {
	public static void main(String arg[]) throws Exception {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		Scanner sc=null;
		String query=null;
					
		try {
			sc=new Scanner(System.in);
			if(sc!=null) {
				System.out.println("Enter id:");
				query=sc.nextLine();
				
			}
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Vinayh7541");
			st=con.createStatement();
		//	String query="select * from student where id="+Sid;
			System.out.println(query);
			flag=st.execute(query);
			if(flag) 
			{
				System.out.println("select query");
				rs=st.getResultSet();
				while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
			}
			else 
				{
				System.out.println("non select");
				System.out.println(st.getUpdateCount());
				}
			
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
