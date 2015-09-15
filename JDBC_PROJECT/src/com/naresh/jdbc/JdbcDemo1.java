package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo1 {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		/*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:oradsn","system","system");*/
		System.out.println("connection is Established....");
		if(con!=null){
			Statement stmt=con.createStatement();
			int k=stmt.executeUpdate("create table login_info(username varchar2(20) primary key, password varchar2(20), role varchar2(10))");
			if(k==-1){
				System.out.println("Table Created Successfully!");
			}else{
				System.out.println("Table Already created");
			}
		}
		

	}

}
