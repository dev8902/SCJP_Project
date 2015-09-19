/**
 * 
 */
package com.naresh.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

/**
 * @author Naresh
 *
 */
public class DataBaseMetaDataExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println("DB Name: "+dbmd.getDatabaseProductName());
		System.out.println("DB Version: "+dbmd.getDatabaseProductVersion());
		System.out.println("Driver Name: "+dbmd.getDriverName());
		System.out.println("Driver Version: "+dbmd.getDriverVersion());
		System.out.println("Max columns allowed in DB Table: "+dbmd.getMaxColumnsInTable());
		System.out.println("Max Table Name length: "+dbmd.getMaxTableNameLength());

	}

}
