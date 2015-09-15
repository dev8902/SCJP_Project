/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Naresh
 *
 */
public class JdbcDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from login_info");
		while(rs.next()){
			System.out.println("Username: "+rs.getString(1)+" Password:"+rs.getString(2)+" role: "+rs.getString(3));
			
		}
	con.close();

	}

}
