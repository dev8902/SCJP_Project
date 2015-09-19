/**
 * 
 */
package com.naresh.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * @author Naresh
 *
 */
public class JdbcCallableTest3 {

	/**
	 * @param args
	 */
	private Connection con;
	private CallableStatement csmt;
	public void openConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		System.out.println("Connection opened...");
	}
	
	public void callProcedure() throws Exception{
		csmt=con.prepareCall("{?= call emp_fun()}");
		csmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
		csmt.execute();
		ResultSet rs=(ResultSet)csmt.getObject(1);
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		rs.close();
		con.close();
	}
	public static void main(String[] args) throws Exception{
		JdbcCallableTest3 jct3=new JdbcCallableTest3();
		jct3.openConnection();
		jct3.callProcedure();
		

	}

}
