/**
 * 
 */
package com.naresh.jdbc;

import javax.sql.rowset.JdbcRowSet;

import com.sun.rowset.JdbcRowSetImpl;

/**
 * @author Naresh
 *
 */
public class JdbcRowSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		JdbcRowSet jr=new JdbcRowSetImpl();
		jr.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		jr.setUsername("system");
		jr.setPassword("system");
		/*jr.setCommand("select * from student");
		jr.execute();
		jr.absolute(3);
		System.out.println("Sid: "+jr.getInt(1)+"  Name: "+jr.getString(2));*/
		jr.setCommand("delete from student where sid=19");
		//jr.last();
		//jr.deleteRow();
		System.out.println("Last Row Deleted");
		jr.close();
		// TODO Auto-generated method stub

	}

}
