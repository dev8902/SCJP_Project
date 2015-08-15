/**
 * 
 */
package com.naresh.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @author Naresh
 *
 */
public class PropertiesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream("F:/Workspace/SCJP_Project/Testing/src/com/naresh/collections/abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("user");
		String s1=p.getProperty("designation");
		String s2=p.getProperty("location");
		System.out.println("Name: "+s+"\n designation: "+s1+" \n location: "+s2 );
		p.setProperty("designation","hello");
		FileOutputStream fos=new FileOutputStream("F:/Workspace/SCJP_Project/Testing/src/com/naresh/collections/abc.properties");
		p.store(fos, "changing designation");
		System.out.println(p.getProperty("designation"));
		

	}

}
