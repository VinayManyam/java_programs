package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBASelectQuery2 {

	public static void main(String arg[]) throws Exception {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		Scanner sc=null;
		String Sid=null;
				
		try {
			sc=new Scanner(System.in);
			if(sc!=null) {
				System.out.println("Enter id:");
				Sid=sc.next();
			}
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","password");
			st=con.createStatement();
			String query="select * from student where id="+Sid;
			rs=st.executeQuery(query);
			if(rs!=null) {
				while(rs.next()) {
					flag =true;
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}if(flag==false) {
					System.out.println("No records Founs");
				}
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
		
	} //main close
	
	
}
