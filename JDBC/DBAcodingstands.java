package com.nt.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAcodingstands {


	public static void main(String arg[]) throws Exception {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Vinayh7541");
			st=con.createStatement();
			String query="select * from student";
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
			
					}//close final;
		
	} //main close
	
	
}//class close
