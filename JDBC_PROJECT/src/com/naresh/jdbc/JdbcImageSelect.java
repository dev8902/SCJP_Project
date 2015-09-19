/**
 * 
 */
package com.naresh.jdbc;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Naresh
 *
 */
public class JdbcImageSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		PreparedStatement ps=con.prepareStatement("select profile_pic from login_info where username=? ");
		ps.setString(1, "Naresh");
		ResultSet rs=ps.executeQuery();
		rs.next();
		InputStream is=rs.getBinaryStream(1);
		FileOutputStream fis=new FileOutputStream("C:/Users/Naresh/Desktop/Naresh.gif");
		int k;
		while((k=is.read())!=-1){
			fis.write(k);
		}
		fis.close();
		System.out.println("Naresh record is displayed successfully...");
		con.close();
		

	}

}
