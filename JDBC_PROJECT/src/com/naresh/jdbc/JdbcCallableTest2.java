/**
 * 
 */
package com.naresh.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;


/**
 * @author Naresh
 *
 */

public class JdbcCallableTest2 {

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
		csmt=con.prepareCall("{call bonus_pro(?,?,?)}");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Number:");
		int eno=sc.nextInt();
		csmt.setInt(1, eno);
		csmt.registerOutParameter(2, Types.VARCHAR);
		csmt.registerOutParameter(3, Types.INTEGER);
		csmt.execute();
		String s1=csmt.getString(2);
		double x=csmt.getDouble(3);
		System.out.println("Employee Name=" +s1);
		System.out.println("Bonus="+x);
		con.close();
	}
	public static void main(String[] args) throws Exception{
		JdbcCallableTest2 jct2=new JdbcCallableTest2();
		jct2.openConnection();
		jct2.callProcedure();
		

	}

}
