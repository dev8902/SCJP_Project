/**
 * 
 */
package com.naresh.ExceptionDemo;

/**
 * @author Naresh
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("State1");
		try{
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println("State3");	
	}

}
