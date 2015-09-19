/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * @author Naresh
 *
 */
public class ResultSetMetaDataExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println("Number of Columns: "+rsmd.getColumnCount());
		System.out.println("Columns: "+rsmd.getColumnName(1) +rsmd.getColumnName(2));
		System.out.println("Column Type Name: "+rsmd.getColumnTypeName(1)+rsmd.getColumnTypeName(2));
		System.out.println("Display size: "+rsmd.getColumnDisplaySize(1)+rsmd.getColumnDisplaySize(2));
		rs.close();
		

	}

}
