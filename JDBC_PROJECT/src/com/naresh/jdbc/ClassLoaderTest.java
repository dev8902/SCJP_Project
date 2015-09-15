/**
 * 
 */
package com.naresh.jdbc;

/**
 * @author Naresh
 *
 */
public class ClassLoaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		Class c=Class.forName("com.naresh.jdbc.Naresh");
		Object o=c.newInstance();
		Naresh n=(Naresh)o;
		
		
		

	}

}
