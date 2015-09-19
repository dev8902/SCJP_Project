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
public class ScrollableTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		Statement st=con.createStatement(1005,1007);
		ResultSet rs=st.executeQuery("select * from student");
		//reading in background direction.
		rs.afterLast();
		while(rs.previous()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
		System.out.println("===================================");
		// printing 3rd record.
		rs.absolute(3);
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		System.out.println("====================================");
		// Printing 1 record back from current position.
		rs.relative(-1);
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		int k=rs.getRow();
		System.out.println("Cursor is at: "+k);
		con.close();
		
	

	}

}
