/**
 * 
 */
package com.naresh.servlet;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * @author Naresh
 *
 */
public class ConnectionBean {
	
	private static Connection connection=null;
	
	public static  Connection   getConnection1(){
		try{
		Class.forName("oracle.jdbc.OracleDriver");
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		}catch(Exception e){
			e.printStackTrace();
			try{
			connection.close();
			}catch(Exception e1){
				e1.printStackTrace();
			}
			
		}
		return connection;
		
	}

}
