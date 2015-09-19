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
public class MySqlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		if(con!=null){
			System.out.println("Connection created successfully...");
		}
		/*Statement stmt=con.createStatement();
		int k=stmt.executeUpdate("create table student(sid int,sname varchar(20)");*/
		

	}

}
