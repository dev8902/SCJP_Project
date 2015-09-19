/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Naresh
 *
 */
public class SavepointTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		DatabaseMetaData dbmd=con.getMetaData();
		if(dbmd.supportsSavepoints()){
		System.out.println("Savepoint supported by the driver");
		con.setAutoCommit(false);
		Statement stmt=con.createStatement();

	}
	}
}
