/**
 * 
 */
package com.naresh.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * @author Naresh
 *
 */

public class JdbcFunction {

	/**
	 * @param args
	 */
	Connection con;
	CallableStatement csmt;
	
	public void openConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		
	}
	public void parepareCall() throws Exception{
		CallableStatement csmt=con.prepareCall("{?=call fun3(?)}");
		csmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Table name:");
		String tname=sc.next();
		csmt.setString(2, tname);
		csmt.execute();
		ResultSet rs=(ResultSet)csmt.getObject(1);
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		con.close();
	}
	public static void main(String[] args) throws Exception{
		JdbcFunction jf=new JdbcFunction();
		jf.openConnection();
		jf.parepareCall();

	}

}
