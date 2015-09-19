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
public class JdbcCallableTest {

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
		csmt=con.prepareCall("{call naresh_pro(?,?)}");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmployeeId");
		int empid=sc.nextInt();
		csmt.setInt(1, empid);
		csmt.registerOutParameter(2, Types.INTEGER);
		csmt.execute();
		int x=csmt.getInt(2);
		System.out.println("Output: Experience of empno="+empid+" is:"+x+": yrs");
		con.close();
	}
	
	public static void main(String[] args) throws Exception{
		
		JdbcCallableTest jct=new JdbcCallableTest();
		jct.openConnection();
		jct.callProcedure();
		
	}

}
