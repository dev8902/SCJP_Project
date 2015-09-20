/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Savepoint;
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
		int k=stmt.executeUpdate("insert into student values(19,'balu')");
		Savepoint sp=con.setSavepoint("spoint1");
		int m=stmt.executeUpdate("delete from student where sid=11");
		con.rollback(sp);
		con.commit();
		System.out.println("done...");
		stmt.close();

	}
	}
}
