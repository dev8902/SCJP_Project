/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Naresh
 *
 */
public class JdbcDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		PreparedStatement psmt=con.prepareStatement("select * from login_info where username=?");
		psmt.setString(1,"Naresh");
		ResultSet rs=psmt.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}

	}

}
