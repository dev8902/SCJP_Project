/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Naresh
 *
 */
public class TransactionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		Statement stmt=con.createStatement();
		con.setAutoCommit(false);
		try{
		int i1= stmt.executeUpdate("insert into student values(78,'naresh')");
		int i2= stmt.executeUpdate("insert into student values(98,'naresh')");
		int i3= stmt.executeUpdate("insert into student values(88,'naresh')");
		con.commit();
		System.out.println("successfully data saved...");
		}catch(Exception e){
			con.close();
		}

	}

}
