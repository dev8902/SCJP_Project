/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.PooledConnection;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

/**
 * @author Naresh
 *
 */
public class ConnectionPoolingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		OracleConnectionPoolDataSource oc=new OracleConnectionPoolDataSource();
		oc.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		oc.setUser("system");
		oc.setPassword("system");
		PooledConnection pc= oc.getPooledConnection();
		Connection con=pc.getConnection();
		System.out.println("Connection1");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next()){
			System.out.println("STUDENT ID: "+rs.getInt(1)+"    STUDENT NAME: "+rs.getString(2));
		}
		Connection con1=oc.getConnection();
		System.out.println("Connection2");
		Statement st1=con.createStatement();
		ResultSet rs1=st1.executeQuery("select * from student");
		while(rs1.next()){
			System.out.println("STUDENT ID: "+rs1.getInt(1)+"    STUDENT NAME: "+rs1.getString(2));
		}
		

	}

}
