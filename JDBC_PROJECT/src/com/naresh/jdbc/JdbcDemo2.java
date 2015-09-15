/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author Naresh
 *
 */
public class JdbcDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		/*Properties p=new Properties();
		p.put("username", "system");
		p.put("password", "system");
		p.put("url", "jdbc:oracle:thin:@localhost:1521:xe");
		p.put("driverClass", "oracle.jdbc.OracleDriver");*/
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		/*oracle.jdbc.OracleDriver d1= new oracle.jdbc.OracleDriver();
		Connection con=d1.connect("jdbc:oracle:thin:@localhost:1521:xe", p);*/
		Statement stmt=con.createStatement();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your prepared LoginId");
		String username=scanner.next();
		System.out.println("Enter your prepared Password");
		String password=scanner.next();
		System.out.println("Enter your Role");
		String role=scanner.next();
		int result=stmt.executeUpdate("insert into login_info values('"+username+"','"+password+"','"+role+"')");
		if(result !=0){
			System.out.println("Successfully inserted in DB...");
		}
		stmt.close();
		con.close();
		
		
		
		
		

	}

}
