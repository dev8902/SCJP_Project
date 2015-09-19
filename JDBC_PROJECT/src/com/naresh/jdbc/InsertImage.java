/**
 * 
 */
package com.naresh.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author Naresh
 *
 */
public class InsertImage {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		File f=new File("C:/Users/Naresh/Desktop/pic.png");
		int length=(int)f.length();
		FileInputStream fis=new FileInputStream(f);
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		/*PreparedStatement ps=con.prepareStatement("insert into login_info values(?,?,?,?)");
		ps.setString(1, "Naresh");
		ps.setString(2, "Naresh");
		ps.setString(3, "SSE");*/
		PreparedStatement ps=con.prepareStatement("update login_info set profile_pic=? where username=?");
		ps.setBinaryStream(1, fis,length);
		ps.setString(2, "raj");
		int k=ps.executeUpdate();
		System.out.println(k+" row inserted into db");
		con.close();
		
		

	}

}
