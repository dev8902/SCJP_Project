/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Naresh
 *
 */
public class BatchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		Statement stmt=con.createStatement();
		stmt.addBatch("insert into student values(11,'rajesh')");
		stmt.addBatch("insert into student values(12,'ranga')");
		stmt.addBatch("insert into student values(13,'ram')");
		stmt.addBatch("insert into student values(14,'raghul')");
		con.setAutoCommit(false);
		try{
			int k[]=stmt.executeBatch();
			for(int i=0; i<k.length;i++){
				System.out.println(k[i]+"\t");
				con.commit();
				System.out.println("Batch commands Executed successfully...");
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
