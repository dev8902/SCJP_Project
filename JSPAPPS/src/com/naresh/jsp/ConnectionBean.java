/**
 * 
 */
package com.naresh.jsp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Naresh
 *
 */
public class ConnectionBean {
public static Connection connection=null;
	public static Connection getConnection() {
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
			connection.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return connection;
		
	}
}
