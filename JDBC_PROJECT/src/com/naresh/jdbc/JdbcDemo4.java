/**
 * 
 */
package com.naresh.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Naresh
 *
 */
public class JdbcDemo4 {

	/**
	 * @param args
	 */
	Connection con;
	Statement st;
	public void openConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		
	}
	public void runSql() throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your command here:");
		String query=br.readLine();
		st=con.createStatement();
		boolean b=st.execute(query);
		if(b==true){
			ResultSet rs=st.getResultSet();
			while(rs.next()){
				System.out.println(rs.getString(1)+"\t "+rs.getString(2)+"\t "+rs.getString(3));
			}
			rs.close();
		}else{
			int k=st.getUpdateCount();
			if(k>=0){
				System.out.println("DML command Executed...");
			}else{
				System.out.println("DDL command Executed...");
			}
		}
	
	}
		
public void closeConnection() throws Exception{
	st.close();
	con.close();
}
	public static void main(String[] args) throws Exception{
		JdbcDemo4 jd4=new JdbcDemo4();
		jd4.openConnection();
		jd4.runSql();
		jd4.closeConnection();

	}

}
