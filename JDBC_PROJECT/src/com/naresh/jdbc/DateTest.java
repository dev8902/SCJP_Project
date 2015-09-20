/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author Naresh
 *
 */
public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		PreparedStatement psmt=con.prepareStatement("insert into student values(?,?,?)");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Student id: ");
		int sid=s.nextInt();
		System.out.println("Enter Student Name: ");
		String sname=s.next();
		System.out.println("Enter Student Joining Date: ");
		String sdate=s.next();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-YYYY");
		java.util.Date d= sd.parse(sdate);
		long ms=d.getTime();
		java.sql.Date d2=new java.sql.Date(ms);
		psmt.setInt(1, sid);
		psmt.setString(2, sname);
		psmt.setDate(3, d2);
		int k=psmt.executeUpdate();
		System.out.println(k+ "row inserted successfully in DB");
		
		
		

	}

}
