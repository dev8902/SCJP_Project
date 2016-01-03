/**
 * 
 */
package com.naresh.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Naresh
 *
 */
public class CurdBean {

	private static Connection connection;
	private String command;
	public void setCommand(String command) {
		this.command = command;
	}
	public String getCommand() {
		return command;
	}
	public static Connection openConnection(){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
			System.out.println(connection);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}
	public void closeConnection(){
		try{
			connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public int m1(){
		int k=0;
		try{
			connection=CurdBean.openConnection();
			Statement stmt=connection.createStatement();
			k=stmt.executeUpdate(command);
		}catch(Exception e){
			e.printStackTrace();
		}
		return k;
	}
	public ArrayList m2(){
		ArrayList al=new ArrayList();
		try{
			connection=CurdBean.openConnection();
			Statement stmt1=connection.createStatement();
			ResultSet resultSet=stmt1.executeQuery(command);
			while(resultSet.next()){
				String str=resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3);
				System.out.println(str);
				al.add(str);
			}
			resultSet.close();
			stmt1.close();
			
		}catch(Exception e){
			System.out.println(e);
		}
		return al;
	}
}
